package com.demo.service.impl;

import com.demo.mapper.ItemsMapperCustom;
import com.demo.po.ItemQueryVo;
import com.demo.po.ItemsCustom;
import com.demo.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by WangZeQiu on 2016/12/16.
 */
public class ItemsServiceImpl implements ItemsService{

    @Autowired(required=false)
    private ItemsMapperCustom itemsMapperCustom;

    //通过ItemsMapperCustom查询数据库
    public List<ItemsCustom> findItemsList(ItemQueryVo itemsQueryVo) throws Exception {
        return itemsMapperCustom.findItemsList(itemsQueryVo);
    }
}
