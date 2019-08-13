package io.renren.modules.luck.controller;

import io.renren.modules.luck.entity.LuckEntity;
import io.renren.modules.luck.service.impl.LuckServiceImpl;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @auther:zwg
 * @Data:2019/8/13
 **/
@Controller
@RequestMapping("/luck")
public class LuckController {
    @Autowired
    private LuckServiceImpl LuckServiceImpl;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "hello";
    }

    @RequestMapping("/page")
    public String page(){
        return "../modules/luck/luck.html";
    }

    @RequestMapping("/getnum")
    @ResponseBody
    public LuckEntity getnum(){
        return LuckServiceImpl.queryNum();
    }
}
