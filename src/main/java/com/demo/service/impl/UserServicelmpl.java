package com.demo.service.impl;

import com.demo.bean.LoginBean;
import com.demo.bean.RegisterBean;
import com.demo.mapper.UserMapper;
import com.demo.model.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by WangZeQiu on 2017/5/9.
 */
public class UserServicelmpl implements UserService {

    @Autowired(required = false)
    UserMapper userMapper;

    public int deleteByPrimaryKey(Integer userId) {
        return userMapper.deleteByPrimaryKey(userId);
    }

    public int insert(RegisterBean registerBean) {
        return userMapper.insert(registerBean);
    }

    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    public User selectByPrimaryKey(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    public User selectByPrimary(LoginBean loginBean) {
        return userMapper.selectByPrimary(loginBean);
    }

    public User selectByPrimaryName(String userName) {
        return userMapper.selectByPrimaryName(userName);
    }


    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }
}
