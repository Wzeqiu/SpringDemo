package com.demo.bean;

/**
 * 创建日期：2017/5/9 15:41
 *
 * @author WangZeQiu
 * @version 1.0
 * @since JDK 1.8.0_131
 * 文件名称： RegisterBean.java
 * 类说明： 注册传参
 */
public class RegisterBean {

    public String userName;
    public String userPasswad;
    public String userCreateTime;

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

    public String getUserCreateTime() {
        return userCreateTime;
    }

    public void setUserCreateTime(String userCreateTime) {
        this.userCreateTime = userCreateTime;
    }


    @Override
    public String toString() {
        return "RegisterBean{" +
                "userName='" + userName + '\'' +
                ", userPasswad='" + userPasswad + '\'' +
                ", userCreateTime='" + userCreateTime + '\'' +
                '}';
    }
}
