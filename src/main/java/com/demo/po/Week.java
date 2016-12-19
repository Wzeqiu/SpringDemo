package com.demo.po;

import java.util.Date;

public class Week {
    private Integer id;

    private String headurl;

    private String nikename;

    private Date time;

    private Integer pinglun;

    private String title;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHeadurl() {
        return headurl;
    }

    public void setHeadurl(String headurl) {
        this.headurl = headurl == null ? null : headurl.trim();
    }

    public String getNikename() {
        return nikename;
    }

    public void setNikename(String nikename) {
        this.nikename = nikename == null ? null : nikename.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getPinglun() {
        return pinglun;
    }

    public void setPinglun(Integer pinglun) {
        this.pinglun = pinglun;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
}