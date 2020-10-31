package com.zkw.springbootsxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @RequestMapping("/main")
    @ResponseBody
    public String home(){
        String a = "a";

        return "main,hello23!";
    }
}
