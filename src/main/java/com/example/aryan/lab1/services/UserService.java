package com.example.aryan.lab1.services;

import org.springframework.stereotype.Service;
import com.example.aryan.lab1.entity.User;

@Service
public class UserService {
    public User getUser() {
        return new User(1, "Aryan", "ar.gmail.com");
    }
}
