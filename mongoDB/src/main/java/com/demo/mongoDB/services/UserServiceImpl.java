package com.demo.mongoDB.services;

import com.demo.mongoDB.model.Users;
import com.demo.mongoDB.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo userRepo;
    @Override
    public String save(Users users) {
        return userRepo.save(users).getId();
    }
}
