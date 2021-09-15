package com.zjipst.order.entity;


import com.zjipst.user.entity.User;
import lombok.Data;

/**
 * @author songhao
 */
@Data
public class Order {

    private Long id;

    private Long userId;

    private String name;

    private Long price;

    private Integer num;

    private User user;
}
