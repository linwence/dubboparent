package com.vincent.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.vincent.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConsumerController {
    @Autowired
    ConsumerService consumerService;

    @RequestMapping("/say")
    @ResponseBody
    public String say(){
        consumerService.say("hello");
        return "aaa";
    }
}
