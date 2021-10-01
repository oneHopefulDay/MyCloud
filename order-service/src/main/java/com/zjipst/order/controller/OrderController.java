package com.zjipst.order.controller;

import com.zjipst.order.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author songhao
 */
@Controller
public class OrderController {

    private static final Logger logger = LoggerFactory.getLogger(OrderController.class) ;

    @Autowired
    private OrderService orderService;


    @RequestMapping("/getOrder/{id}")
    @ResponseBody
    public Object getOrderById(@PathVariable Long id, @RequestHeader(value = "X-Request-red",required = false) String x){
        logger.info("传递的参数X-Request-red的值{}",x);
        return orderService.getOrderById(id);
    }

    @RequestMapping("/listOrders")
    @ResponseBody
    public Object list(){
        return orderService.list();
    }
}
