package com.demo.enums;

/**
 * 创建日期：2017/5/9 14:03
 *
 * @author WangZeQiu
 * @version 1.0
 * @since JDK 1.8.0_131
 * 文件名称： StateCodeEnum.java
 * 类说明： 返回状态
 */

public enum StateCodeEnum {

    E0000(1000, "成功"),
    E0050(1050, "账号或者密码错误"),
    E0051(1051, "账号已存在"),
    E0052(1052, "注册失败"),
    E1000(1, "参数错误");


    private int code;
    private String msg;

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    private StateCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
