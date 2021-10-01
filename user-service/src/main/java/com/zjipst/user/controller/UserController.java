package com.zjipst.user.controller;

import com.zjipst.user.config.Properties;
import com.zjipst.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author songhao
 */
@Controller
//@RefreshScope
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);


    @Autowired
    private UserService userService;

//    @Value("${pattern.dateformat}")
//    private String dateformat;

    @Autowired
    private Properties properties;

    @RequestMapping("get")
    @ResponseBody
    public Properties get(){
        return properties;
    }


    @RequestMapping("getTime")
    @ResponseBody
    public String now(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(properties.getDateformat()));
    }


    @RequestMapping("/getUser/{id}")
    @ResponseBody
    public Object getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @RequestMapping("/listUsers")
    @ResponseBody
    public Object getUserById(){
        return userService.list();
    }
}
