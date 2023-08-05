package com.zizhuo.selfweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/login")
    public String Login(){
        return "login.html";
    }

    @RequestMapping("/index")
    public String Index(){
        return "index.html";
    }
}
