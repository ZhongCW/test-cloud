package test.cloud.service.order.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import test.cloud.service.user.po.User;

@FeignClient("test-cloud-service-user")
@RequestMapping("/user")
public interface UserService {

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Long id);

}
