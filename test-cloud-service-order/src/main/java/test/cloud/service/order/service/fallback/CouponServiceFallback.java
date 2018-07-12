package test.cloud.service.order.service.fallback;

import org.springframework.stereotype.Component;
import test.cloud.service.coupon.entity.Coupon;
import test.cloud.service.order.service.CouponService;

/**
 * @author ZCW
 * @createTime 2018/7/3
 * @lastUpdateTime 2018/7/3 ZCW
 */
@Component
public class CouponServiceFallback implements CouponService {
    @Override
    public Coupon getCoupon(Long id) {
        return null;
    }
}
