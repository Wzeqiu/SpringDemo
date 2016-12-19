package com.demo.mapper;

import com.demo.po.Week;

import java.util.List;

public interface WeekMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Week record);

    int insertSelective(Week record);

    Week selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Week record);

    int updateByPrimaryKey(Week record);

    List<Week> findWeekList(String  nikename);
}