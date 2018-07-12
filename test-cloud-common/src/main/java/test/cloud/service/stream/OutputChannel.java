package test.cloud.service.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author ZCW
 * @createTime 2018/7/12
 * @lastUpdateTime 2018/7/12 ZCW
 */
public interface OutputChannel extends Channel{

    @Output(USER_REGISTER)
    MessageChannel userRegisterOutput();

}
