package test.cloud.service.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.cloud.service.order.po.Order;
import test.cloud.service.order.service.CouponService;
import test.cloud.service.order.service.UserService;

/**
 * @author ZCW
 * @createTime 2018/7/2
 * @lastUpdateTime 2018/7/2 ZCW
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    CouponService couponService;
    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    public Order getOrder(@PathVariable Long id) {
        Order order = new Order(id);
        order.setCoupon(couponService.getCoupon(id));
        order.setUser(userService.getUser(id));
        return order;
    }

}
