package com.netcracker.project.services;

import com.netcracker.project.models.Role;

import java.util.List;

public interface RoleService {

    Role addRole(Role role);
    void delete(Long id);
    Object getById(Long id);
    Role getByName(String name);
    List<Role> getAll();

}
