package test.cloud.service.order.po;

import lombok.Data;
import test.cloud.service.coupon.entity.Coupon;
import test.cloud.service.user.po.User;

import java.math.BigDecimal;

/**
 * @author ZCW
 * @createTime 2018/7/2
 * @lastUpdateTime 2018/7/2 ZCW
 */
@Data
public class Order {
    private Long id;
    private String goodsName;
    private Integer goodsAmount;
    private BigDecimal totalPrice;

    private Coupon coupon;
    private User user;

    public Order(Long id) {
        this.id = id;
    }
}
