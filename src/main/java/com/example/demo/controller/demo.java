package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: HR
 * @Date: 2020/7/17 14:43
 * @Description:
 */
@Controller
public class demo {

    @ResponseBody
    @RequestMapping("healthz")
    public  String healthz(){
        return "ok";
    }
}
