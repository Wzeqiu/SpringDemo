package com.demo.mapper;

import com.demo.po.ItemQueryVo;
import com.demo.po.ItemsCustom;

import java.util.List;

/**
 * Created by WangZeQiu on 2016/12/16.
 */
public interface ItemsMapperCustom {

    List<ItemsCustom> findItemsList(ItemQueryVo itemQueryVo);
}
