package com.demo.dto;

import com.demo.enums.StateCodeEnum;

/**
 * 创建日期：2017/5/9 13:50
 *
 * @author WangZeQiu
 * @version 1.0
 * @since JDK 1.8.0_131
 * 文件名称： Result.java
 * 类说明： 返回实体类
 */
public class Result {

    private int code;
    private String msg;
    private Object data;

    public Result() {

    }

    public Result(StateCodeEnum codeEnum) {
        this.code = codeEnum.getCode();
        this.msg = codeEnum.getMsg();
    }

    public Result(StateCodeEnum codeEnum, Object data) {
        this.code = codeEnum.getCode();
        this.msg = codeEnum.getMsg();
        this.data = data;
    }


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

    public void setData(Object data) {
        this.data = data == null ? "" : data;
    }

    public Object getData() {
        return data;
    }

}
