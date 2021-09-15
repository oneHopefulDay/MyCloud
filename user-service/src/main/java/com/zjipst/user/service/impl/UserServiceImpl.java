package com.zjipst.user.service.impl;

import com.zjipst.user.dao.UserMapper;
import com.zjipst.user.entity.User;
import com.zjipst.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author songhao
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> list() {
        return userMapper.list();
    }

    @Override
    public User getUserById(Long id) {
        return userMapper.getUserById(id);
    }
}
