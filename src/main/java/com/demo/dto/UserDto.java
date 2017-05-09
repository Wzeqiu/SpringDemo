package com.demo.dto;

/**
 * 创建日期：2017/5/9 15:32
 *
 * @author WangZeQiu
 * @version 1.0
 * @since JDK 1.8.0_131
 * 文件名称： UserDto.java
 * 类说明： 返回用户信息
 */
public class UserDto {

    private Integer userId;

    private String userName;

    private String userPasswad;

    private String userHead;

    private String userCreateTime;

    private String userNike;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPasswad() {
        return userPasswad;
    }

    public void setUserPasswad(String userPasswad) {
        this.userPasswad = userPasswad == null ? null : userPasswad.trim();
    }

    public String getUserHead() {
        return userHead;
    }

    public void setUserHead(String userHead) {
        this.userHead = userHead == null ? null : userHead.trim();
    }

    public String getUserCreateTime() {
        return userCreateTime;
    }

    public void setUserCreateTime(String userCreateTime) {
        this.userCreateTime = userCreateTime == null ? null : userCreateTime.trim();
    }

    public String getUserNike() {
        return userNike;
    }

    public void setUserNike(String userNike) {
        this.userNike = userNike == null ? null : userNike.trim();
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPasswad='" + userPasswad + '\'' +
                ", userHead='" + userHead + '\'' +
                ", userCreateTime='" + userCreateTime + '\'' +
                ", userNike='" + userNike + '\'' +
                '}';
    }
}
