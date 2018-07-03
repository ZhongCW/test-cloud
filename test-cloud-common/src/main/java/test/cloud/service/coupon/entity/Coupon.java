package test.cloud.service.coupon.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author ZCW
 * @createTime 2018/7/1
 * @lastUpdateTime 2018/7/1 ZCW
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coupon {
    private Long id;
    private String name;
    private BigDecimal money;
    private Date expires;

    public Coupon(Long id) {
        this.id = id;
    }
}
