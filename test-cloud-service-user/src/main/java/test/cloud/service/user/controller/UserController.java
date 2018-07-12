package test.cloud.service.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import test.cloud.service.coupon.entity.Coupon;
import test.cloud.service.user.dao.UserRepository;
import test.cloud.service.user.po.User;
import test.cloud.service.user.service.CouponService;
import test.cloud.service.user.service.UserService;

import java.util.List;
import java.util.Random;


@RestController
@RequestMapping("/user")
public class UserController {
  @Autowired
  private UserRepository userRepository;
  @Autowired
  private UserService userService;

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

  @GetMapping("/register")
  public String register(){
    userService.register(new User(new Random().nextLong()));
    return "sucess";
  }

}
