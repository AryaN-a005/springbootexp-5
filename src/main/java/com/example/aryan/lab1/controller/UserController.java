package com.example.aryan.lab1.controller;

import com.example.aryan.lab1.entity.User;
import com.example.aryan.lab1.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public User getUser() {
        return userService.getUser();
    }
}
