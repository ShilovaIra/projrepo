package com.netcracker.project.services.impl;

import com.netcracker.project.models.Role;
import com.netcracker.project.repositories.RoleRepository;
import com.netcracker.project.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role addRole(Role role) {
        Role savedRole = roleRepository.saveAndFlush(role);
        return savedRole;
    }

    @Override
    public void delete(Long id) {
        roleRepository.deleteById(id);
    }

    @Override
    public Object getById(Long id) {
        return roleRepository.findById(id);
    }

    @Override
    public Role getByName(String name) {
        return roleRepository.findByName(name);
    }

    @Override
    public List<Role> getAll() {
        return roleRepository.findAll();
    }
}
