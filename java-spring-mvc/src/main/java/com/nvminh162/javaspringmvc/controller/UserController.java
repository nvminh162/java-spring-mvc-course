package com.nvminh162.javaspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nvminh162.javaspringmvc.service.UserService;

// Spring MVC Model
@Controller
public class UserController {

    private UserService userService;
    
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String getHomePage() {
        String test = this.userService.handleHello();
        return "nvminh162.html";
    }
}

// Spring RestFul API
/* @RestController
public class UserController {

    private UserService userService;
    
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String getHomePage() {
        return userService.handleHello();
    }
} 
 */