package com.demo.service.impl;

import com.demo.mapper.WeekMapper;
import com.demo.po.Week;
import com.demo.service.WeekService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by WangZeQiu on 2016/12/19.
 */
public class WeekServiceImpl implements WeekService {
    @Autowired(required = false)
    WeekMapper weekMapper;

    public List<Week> findWeekList(String id) throws Exception {
        return weekMapper.findWeekList(id);
    }
}
