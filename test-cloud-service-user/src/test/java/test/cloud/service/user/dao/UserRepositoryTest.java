package test.cloud.service.user.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.core.IsEqual.*;

/**
 * @author ZCW
 * @createTime 2018/6/29
 * @lastUpdateTime 2018/6/29 ZCW
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @Test
    public void testGetUser(){
        Assert.assertThat(userRepository.getOne(1L).getId(),equalTo(1L));
    }
}
