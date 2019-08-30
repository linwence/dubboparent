package com.vincent.service;


import com.alibaba.dubbo.config.annotation.Service;

@Service(version = "1.0",interfaceName = "com.vincent.service.UserService")
public class UserServiceImpl implements UserService {
    @Override
    public String say(String content) {

        System.out.println("say:"+content);
        return content;
    }
}
