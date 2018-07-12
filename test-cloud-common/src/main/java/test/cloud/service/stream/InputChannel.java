package test.cloud.service.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface InputChannel extends Channel {
    @Input(USER_REGISTER)
    SubscribableChannel userRegisterInput();
}
