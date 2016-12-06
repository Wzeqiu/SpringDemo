package com.demo.service.impl;

import com.demo.mapper.UserMapper;
import com.demo.po.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by WangZeQiu on 2016/12/6.
 */
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    public User getUser(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
