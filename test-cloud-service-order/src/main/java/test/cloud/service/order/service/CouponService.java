package test.cloud.service.order.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import test.cloud.service.coupon.entity.Coupon;
import test.cloud.service.order.service.fallback.CouponServiceFallback;

@FeignClient(value = "test-cloud-service-coupon",fallback = CouponServiceFallback.class)
//@RequestMapping("/coupon")
public interface CouponService {

    @GetMapping("/coupon/{id}")
    public Coupon getCoupon(@PathVariable("id") Long id);

}
