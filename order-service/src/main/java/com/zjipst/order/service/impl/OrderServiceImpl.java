package com.zjipst.order.service.impl;


import com.zjipst.client.UserClient;
import com.zjipst.pojo.User;
import com.zjipst.order.dao.OrderMapper;
import com.zjipst.order.service.OrderService;
import com.zjipst.order.entity.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author songhao
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

//    @Autowired
//    private RestTemplate restTemplate;

//    @Override
//    public Order getOrderById(Long id) {
//        Order order = orderMapper.getOrder(id);
//        String url = "http://userService/getUser/"+order.getUserId();
//        User user = restTemplate.getForObject(url, User.class);
//        order.setUser(user);
//        return order;
//    }

    @Autowired
    private UserClient userClient;

    @Override
    public Order getOrderById(Long id) {
        Order order = orderMapper.getOrder(id);
        User user = userClient.findByUserId(order.getUserId());
        order.setUser(user);
        return order;
    }

    @Override
    public List<Order> list() {
        return orderMapper.list();
    }
}
