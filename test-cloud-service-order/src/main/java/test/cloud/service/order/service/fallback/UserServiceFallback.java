package test.cloud.service.order.service.fallback;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import test.cloud.service.order.service.UserService;
import test.cloud.service.user.po.User;

/**
 * @author ZCW
 * @createTime 2018/7/3
 * @lastUpdateTime 2018/7/3 ZCW
 */
@Component
public class UserServiceFallback implements UserService {

    @Override
    public User getUser(Long id) {
        return null;
    }

}
