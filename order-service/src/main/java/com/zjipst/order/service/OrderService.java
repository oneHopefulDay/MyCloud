package com.zjipst.order.service;

import com.zjipst.order.entity.Order;

import java.util.List;

/**
 * @author songhao
 */
public interface OrderService {

    /** 根据id查询订单
     * @param id
     * @return
     */
    Order getOrderById(Long id);

    /**查询所有订单
     * @return
     */
    List<Order> list();
}
