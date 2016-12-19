package com.demo.service;

import com.demo.po.Week;

import java.util.List;

/**
 * Created by WangZeQiu on 2016/12/19.
 */
public interface WeekService {
    public List<Week> findWeekList(String id) throws Exception;
}
