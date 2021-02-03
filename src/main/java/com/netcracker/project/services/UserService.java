package com.netcracker.project.services;

import com.netcracker.project.models.Users;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {

    Users addUser(Users user);
    void delete(Long id);
    Optional<Users> getById(Long id);
    Users getByLogin(String login);
    Users updateUser(Users user);
    List<Users> getAll();
}
