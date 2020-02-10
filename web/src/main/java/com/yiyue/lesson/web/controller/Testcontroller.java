package com.yiyue.lesson.web.controller;

import com.yiyue.lesson.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Testcontroller {
    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String hell(){
        return userService.testService();
    }

}
