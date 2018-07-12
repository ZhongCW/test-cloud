package test.cloud.service.coupon.receiver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import test.cloud.service.stream.InputChannel;
import test.cloud.service.stream.OutputChannel;
import test.cloud.service.user.po.User;

/**
 * @author ZCW
 * @createTime 2018/7/11
 * @lastUpdateTime 2018/7/11 ZCW
 */
@Slf4j
@EnableBinding(InputChannel.class)
public class CouponReceiver {

    // 注册赠送优惠卷
    @StreamListener(InputChannel.USER_REGISTER)
    public void register(User user) {
//        try {
//            Thread.sleep(5*1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        log.info("用户注册完成，开始赠送优惠卷：{}",user);
        // TODO
    }

}
