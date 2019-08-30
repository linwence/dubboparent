package com.vincent.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @Reference(version = "1.0")
    UserService userService;

    public String say(String c){
        userService.say(c);
        return c;
    }
}
