package com.demo.service;

import com.demo.bean.LoginBean;
import com.demo.bean.RegisterBean;
import com.demo.model.User;


/**
 * Created by WangZeQiu on 2017/5/9.
 */
public interface UserService {

    int deleteByPrimaryKey(Integer userId);

    int insert(RegisterBean registerBean);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    User selectByPrimary(LoginBean loginBean);

    User selectByPrimaryName(String userName);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
