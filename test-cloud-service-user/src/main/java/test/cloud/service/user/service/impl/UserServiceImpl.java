package test.cloud.service.user.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import test.cloud.service.user.po.User;
import test.cloud.service.user.service.UserService;
import test.cloud.service.stream.OutputChannel;

/**
 * @author ZCW
 * @createTime 2018/7/11
 * @lastUpdateTime 2018/7/11 ZCW
 */
@Slf4j
@Service
//@EnableBinding(Source.class)
@EnableBinding(OutputChannel.class)
public class UserServiceImpl implements UserService {

    @Autowired
    OutputChannel outputChannel;

    @Override
    public void register(User user) {
        log.info("用户注册完成");
        outputChannel.userRegisterOutput().send(MessageBuilder.withPayload(user).build());
        log.info("用户注册事件发布完成");
    }

}
