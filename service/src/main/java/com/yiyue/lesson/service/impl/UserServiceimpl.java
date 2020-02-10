package com.yiyue.lesson.service.impl;

import com.yiyue.lesson.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceimpl implements UserService {
    @Override
    public String testService() {
        return "testService";
    }
}
