package com.demo.controller;

import com.demo.po.ItemsCustom;
import com.demo.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by WangZeQiu on 2016/12/6.
 */
//使用@Controller来标识它是一个控制器
@Controller
//为了对url进行分类管理 ，可以在这里定义根路径，最终访问url是根路径+子路径
//比如：商品列表：/items/queryItems.action
public class UserController {

    //    @RequestMapping(value = "/index",method={RequestMethod.GET})
//    public String index(){
//        return "index";
//
//    }
    @Autowired
    private ItemsService itemsService;

    //商品查询
    @RequestMapping(value = "/index")
    public ModelAndView queryItems() throws Exception {
        //调用Service查找数据库，查询商品列表，这里使用静态数据模拟
        List<ItemsCustom> itemsList = itemsService.findItemsList(null);

        //返回ModelAndView
        ModelAndView modelAndView = new ModelAndView();
        //相当于request的setAttribute，在jsp页面中通过itemList来获取
        modelAndView.addObject("itemsList", itemsList);
        //指定视图
        modelAndView.setViewName("index");
        System.out.println("注解方式:ItemsComtroller......");
        return modelAndView;
    }

}