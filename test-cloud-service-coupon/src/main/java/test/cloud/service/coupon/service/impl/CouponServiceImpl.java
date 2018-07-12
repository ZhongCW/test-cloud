package test.cloud.service.coupon.service.impl;

import javafx.scene.control.Skin;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.handler.annotation.SendTo;
import test.cloud.service.coupon.entity.Coupon;
import test.cloud.service.coupon.service.CouponService;
import test.cloud.service.user.po.User;

import java.util.LinkedList;
import java.util.List;

/**
 * @author ZCW
 * @createTime 2018/7/4
 * @lastUpdateTime 2018/7/4 ZCW
 */
@Slf4j
//@EnableBinding(Sink.class)
public class CouponServiceImpl implements CouponService {
    @Override
//    @StreamListener(Sink.INPUT)
    public void sendCouponToUser(User user) {
        log.info("给用户:{} 分发优惠卷:{} ",user,user);
    }

    @Override
//    @SendTo(Processor.OUTPUT)
    public List<Coupon> getCouponsByUser(Long id) {
        log.info("获取用户:{} 所有优惠卷",id);
        List<Coupon> coupons = new LinkedList<>();
        coupons.add(new Coupon(id));
        coupons.add(new Coupon(id));
        coupons.add(new Coupon(id));
        return coupons;
    }
}
