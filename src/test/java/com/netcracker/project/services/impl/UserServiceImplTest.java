package com.netcracker.project.services.impl;

import com.netcracker.project.models.Users;
import com.netcracker.project.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplTest {

    @Autowired
    private static UserRepository userRepository;

    @Autowired
    UserServiceImpl userService;


    @Test
    void testAddUser() {

        //Users users =  new Users(Integer.toUnsignedLong(3),"Ira");
        //userService.addUser(users);
        userRepository.saveAndFlush(new Users(Integer.toUnsignedLong(3),"Ira"));
        //System.out.println(userService.getAll());
    }

    @Test
    void testGetAll() {
    }
}