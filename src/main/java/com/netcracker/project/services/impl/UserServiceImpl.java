package com.netcracker.project.services.impl;

import com.netcracker.project.models.Users;
import com.netcracker.project.repositories.UserRepository;
import com.netcracker.project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private static UserRepository userRepository;

    public UserRepository getUserRepository() {
        return userRepository;
    }

    @Override
    public Users addUser(Users user) {
        Users savesUsers = userRepository.saveAndFlush(user);
        return savesUsers;
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public Optional<Users> getById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public Users getByLogin(String login) {
        return userRepository.findByLogin(login);
    }

    @Override
    public Users updateUser(Users user) {
        return userRepository.saveAndFlush(user);
    }

    @Override
    public List<Users> getAll() {
        return userRepository.findAll();
    }
}
