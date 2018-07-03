package test.cloud.service.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.cloud.service.coupon.entity.Coupon;
import test.cloud.service.user.dao.UserRepository;
import test.cloud.service.user.po.User;
import test.cloud.service.user.service.CouponService;

import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {
  @Autowired
  private UserRepository userRepository;

  @GetMapping("/{id}")
  public User getUser(@PathVariable Long id) {
    User findOne = this.userRepository.findOne(id);
      System.out.println(findOne);
    return findOne;
  }

  @Autowired
  CouponService couponService;

  @GetMapping("/{id}/coupon")
  public List<Coupon> getUserCouponList(@PathVariable Long id){
    return couponService.getUserCouponList(id);
  }

}
