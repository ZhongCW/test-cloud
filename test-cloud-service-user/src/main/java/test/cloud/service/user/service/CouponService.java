package test.cloud.service.user.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import test.cloud.service.coupon.entity.Coupon;
import test.cloud.service.user.fallback.CouponServiceFallback;

import java.util.List;

/**
 * @author ZCW
 * @createTime 2018/7/1
 * @lastUpdateTime 2018/7/1 ZCW
 */
@FeignClient(name = "test-cloud-service-coupon",fallback = CouponServiceFallback.class)
@RequestMapping("/coupon")
public interface CouponService {

    @GetMapping("/list")
    public List<Coupon> getUserCouponList(@RequestParam("userId") Long userId);

}
