package test.cloud.service.order.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import test.cloud.service.order.service.fallback.UserServiceFallback;
import test.cloud.service.user.po.User;

@FeignClient(value = "test-cloud-service-user",fallback = UserServiceFallback.class)
//@RequestMapping("/user")
public interface UserService {

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Long id);

}

