package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by WangZeQiu on 2016/12/6.
 */
//使用@Controller来标识它是一个控制器
@Controller
//为了对url进行分类管理 ，可以在这里定义根路径，最终访问url是根路径+子路径
//比如：商品列表：/items/queryItems.action
@RequestMapping("/")
public class UserController {
//
//    @Autowired
//    private UserService itemsService;
//    //商品查询列表
//    @RequestMapping("/index")
//    //实现 对queryItems方法和url进行映射，一个方法对应一个url
//    //一般建议将url和方法写成一样
//    public ModelAndView queryItems() throws Exception {
//        //调用service查找数据库，查询商品列表
//
//        System.out.println(itemsService.getUser(1)+"=Name================================aaaa");
////        List<ItemsCustom> itemsList = itemsService.findItemsList(null);
////
////        //返回ModelAndView
//        ModelAndView modelAndView = new ModelAndView();
////        //相当于request的setAttribute方法,在jsp页面中通过itemsList取数据
////        modelAndView.addObject("itemsList",itemsList);
//
//        //指定视图
//        //下边的路径，如果在视图解析器中配置jsp的路径前缀和后缀，修改为items/itemsList
//        //modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
//        //下边的路径配置就可以不在程序中指定jsp路径的前缀和后缀
//        modelAndView.setViewName("index");
//
//        return modelAndView;
//    }
    @RequestMapping(value = "/index",method={RequestMethod.GET})
    public String index(){
        return "indext";

    }


}