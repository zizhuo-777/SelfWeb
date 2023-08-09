package com.zizhuo.selfweb.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/index")
    public String index(){
        return "index.html";
    }


    @RequestMapping("/login")
    public String login(){
        return "login.html";
    }
}
