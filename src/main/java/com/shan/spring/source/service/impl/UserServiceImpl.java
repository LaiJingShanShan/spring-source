package com.shan.spring.source.service.impl;

import com.shan.spring.source.service.MessageService;
import com.shan.spring.source.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired
    private MessageService messageService;
    public String getMessage() {
        return "hello world user";
    }
}