package com.demo.controller;

import com.demo.bean.LoginBean;
import com.demo.bean.RegisterBean;
import com.demo.dto.Result;
import com.demo.enums.StateCodeEnum;
import com.demo.model.User;
import com.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 创建日期：2017/5/9 12:11
 *
 * @author WangZeQiu
 * @version 1.0
 * @since JDK 1.8.0_131
 * 文件名称： UserController.java
 * 类说明：  用户信息
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Resource
    private UserService userService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public Result register(@RequestBody RegisterBean registerBean) {
        logger.info("[register] 参数 " + registerBean.toString());
        if (registerBean == null) {
            return new Result(StateCodeEnum.E0052);
        }
        if (registerBean.getUserName() == null) {
            return new Result(StateCodeEnum.E0050);
        }
        User user = userService.selectByPrimaryName(registerBean.getUserName());
        if (user != null) {
            return new Result(StateCodeEnum.E0051);
        }

        registerBean.setUserCreateTime(stampToDate(System.currentTimeMillis()));

        long id = userService.insert(registerBean);
        if (id == 1) {
            User user1 = userService.selectByPrimaryName(registerBean.getUserName());
            return new Result(StateCodeEnum.E0000, user1);
        }
        return new Result(StateCodeEnum.E0052);
    }

    /*
        * 将时间戳转换为时间
        */
    public static String stampToDate(long s) {
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lt = new Long(s);
        Date date = new Date(s);
        res = simpleDateFormat.format(date);
        return res;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Result login(@RequestBody LoginBean loginBean) {
        System.out.println("[login] 参数=========" + loginBean.toString());
        User user1 = userService.selectByPrimary(loginBean);
        if (user1 == null) {
            return new Result(StateCodeEnum.E0050);
        }
        return new Result(StateCodeEnum.E0000, user1);
    }


}
