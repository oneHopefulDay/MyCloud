package com.zjipst.order.service.impl;

import com.zjipst.order.dao.OrderMapper;
import com.zjipst.order.service.OrderService;
import com.zjipst.order.entity.Order;
import com.zjipst.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author songhao
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Order getOrderById(Long id) {
        Order order = orderMapper.getOrder(id);
        String url = "http://userService/getUser/1";
        User user = restTemplate.getForObject(url, User.class);
        order.setUser(user);
        return order;
    }

    @Override
    public List<Order> list() {
        return orderMapper.list();
    }
}
