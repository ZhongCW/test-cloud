package test.cloud.service.coupon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.cloud.service.coupon.entity.Coupon;

import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ZCW
 * @createTime 2018/7/1
 * @lastUpdateTime 2018/7/1 ZCW
 */
@RestController
@RequestMapping("/coupon")
public class CouponController {

    @GetMapping("/list")
    public List<Coupon> getUserCouponList(Long userId){
        List<Coupon> coupons = new LinkedList<>();
        coupons.add(new Coupon(userId,"电器卷",new BigDecimal("20.00"),new Date("2018/10/10")));
        coupons.add(new Coupon(userId,"电器卷",new BigDecimal("30.00"),new Date("2018/10/10")));
        coupons.add(new Coupon(userId,"电器卷",new BigDecimal("40.00"),new Date("2018/10/10")));
        return coupons;
    }

    @GetMapping("/{id}")
    public Coupon getCoupon(@PathVariable Long id){
        return new Coupon(id);
    }

}
