package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return Arrays.asList(
                new User(1, "Taro", 25),
                new User(2, "Hanako", 30),
                new User(3, "Jiro", 35)
        );
    }
}
