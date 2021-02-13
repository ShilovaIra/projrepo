package com.netcracker.project.repositories;

import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    void findByLogin() {
        userRepository.findByLogin("sonya.vsu");
    }

    @Test
    void findAll() {
        System.out.println(Arrays.asList(userRepository.findAll()));
    }
}