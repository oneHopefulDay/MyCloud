package com.zjipst.user.controller;

import com.zjipst.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author songhao
 */
@Controller
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);


    @Autowired
    private UserService userService;

    @RequestMapping("/getUser/{id}")
    @ResponseBody
    public Object getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @RequestMapping("/listUser")
    @ResponseBody
    public Object getUserById(){
        return userService.list();
    }
}
