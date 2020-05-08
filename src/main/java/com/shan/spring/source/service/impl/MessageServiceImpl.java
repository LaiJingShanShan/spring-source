package com.shan.spring.source.service.impl;

import com.shan.spring.source.service.MessageService;
import com.shan.spring.source.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageServiceImpl implements MessageService {

    @Autowired
    private UserService userService;
    @Autowired
    private MessageService messageService;

    public String getMessage() {
        return userService.getMessage();
    }
}