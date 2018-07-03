package test.cloud.service.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import test.cloud.service.user.po.User;

/**
 * @author ZCW
 * @createTime 2018/6/29
 * @lastUpdateTime 2018/6/29 ZCW
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
