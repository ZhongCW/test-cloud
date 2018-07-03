package test.cloud.service.user.po;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author ZCW
 * @createTime 2018/6/29
 * @lastUpdateTime 2018/6/29 ZCW
 */
@Data
@NoArgsConstructor
@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String username;
    @Column
    private String name;
    @Column
    private String age;
    @Column
    private BigDecimal balance;

    public User(Long id) {
        this.id = id;
    }
}
