package com.accp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {


    @RequestMapping(value = "/sys/index")
    public String index(){
        System.out.println("进入了控制器index");
        return "index";
    }

    @RequestMapping(value = "/hello")
    public String hello(){
        System.out.println("进入了控制器hello");
        return "index";
    }
}
