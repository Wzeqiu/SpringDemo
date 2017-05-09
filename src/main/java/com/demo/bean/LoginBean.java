package com.demo.bean;

/**
 * 创建日期：2017/5/9 15:37
 *
 * @author WangZeQiu
 * @version 1.0
 * @since JDK 1.8.0_131
 * 文件名称： LoginBean.java
 * 类说明： 登录传参
 */
public class LoginBean {
    public String userName;
    public String userPasswad;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPasswad() {
        return userPasswad;
    }

    public void setUserPasswad(String userPasswad) {
        this.userPasswad = userPasswad;
    }

    @Override
    public String toString() {
        return "LoginBean{" +
                "userName='" + userName + '\'' +
                ", userPasswad='" + userPasswad + '\'' +
                '}';
    }
}
