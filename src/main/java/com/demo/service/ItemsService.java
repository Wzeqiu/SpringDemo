package com.demo.service;

import com.demo.po.ItemQueryVo;
import com.demo.po.ItemsCustom;

import java.util.List;

/**
 * Created by WangZeQiu on 2016/12/16.
 */
public interface ItemsService {
    /**
     * 通过ItemsMapperCustomer查询数据库
     */
    public List<ItemsCustom> findItemsList(ItemQueryVo itemsQueryVo)throws Exception;
}
