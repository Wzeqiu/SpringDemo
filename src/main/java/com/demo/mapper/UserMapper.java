package com.demo.mapper;

import com.demo.bean.LoginBean;
import com.demo.bean.RegisterBean;
import com.demo.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(RegisterBean registerBean);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    User selectByPrimary(LoginBean loginBean);

    User selectByPrimaryName(String userName);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}