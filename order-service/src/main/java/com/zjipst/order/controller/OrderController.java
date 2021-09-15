package com.zjipst.order.controller;

import com.zjipst.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author songhao
 */
@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;


    @RequestMapping("/getOrder/{id}")
    @ResponseBody
    public Object getOrderById(@PathVariable Long id){
        return orderService.getOrderById(id);
    }

    @RequestMapping("/listOrders")
    @ResponseBody
    public Object list(){
        return orderService.list();
    }
}
