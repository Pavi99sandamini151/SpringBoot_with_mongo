package com.demo.mongoDB.controller;

import com.demo.mongoDB.model.Users;
import com.demo.mongoDB.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("/save")
    public String saveUser(@RequestBody Users users){
        return userService.save(users);
    }
}
