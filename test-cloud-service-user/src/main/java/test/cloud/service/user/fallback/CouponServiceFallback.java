package test.cloud.service.user.fallback;

import test.cloud.service.coupon.entity.Coupon;
import test.cloud.service.coupon.entity.Coupon;
import test.cloud.service.user.service.CouponService;

import java.util.ArrayList;
import java.util.List;

/**
 * 优惠卷服务降级
 *
 * @author ZCW
 * @createTime 2018/7/1
 * @lastUpdateTime 2018/7/1 ZCW
 */
//@Component
public class CouponServiceFallback implements CouponService {
    @Override
    public List<Coupon> getUserCouponList(Long userId) {
        return new ArrayList<Coupon>();
    }
}
