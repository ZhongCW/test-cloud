package test.cloud.service.coupon.service;

import test.cloud.service.coupon.entity.Coupon;
import test.cloud.service.user.po.User;

import java.util.List;

/**
 * @author ZCW
 * @createTime 2018/7/4
 * @lastUpdateTime 2018/7/4 ZCW
 */
public interface CouponService {
    /**
     * 将优惠卷分发给用户
     * @param user
     */
     void sendCouponToUser(User user);

    /**
     * 获取用户所有优惠卷
     * @param id
     * @return
     */
     List<Coupon> getCouponsByUser(Long id);
//    void createCouponBy
}
