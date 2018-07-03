package test.cloud.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ApplicationContext;

/**
 * @author ZCW
 * @createTime 2018/7/1
 * @lastUpdateTime 2018/7/1 ZCW
 */
@SpringBootApplication
@EnableEurekaServer
public class RegistrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistrationApplication.class, args);
    }

}
