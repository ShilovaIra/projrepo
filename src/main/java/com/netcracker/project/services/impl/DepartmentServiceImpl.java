package com.netcracker.project.services.impl;

import com.netcracker.project.models.Departments;
import com.netcracker.project.repositories.DepartmentRepository;
import com.netcracker.project.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Departments addDepartment(Departments department) {
        Departments savedDepartment = departmentRepository.saveAndFlush(department);
        return savedDepartment;
    }

    @Override
    public void delete(Departments departments) {
        departmentRepository.delete(departments);
    }

    @Override
    public Object getById(Long id) {
        return departmentRepository.findById(id);
    }

    @Override
    public Departments getByName(String name) {
        return departmentRepository.findByName(name);
    }

    @Override
    public List<Departments> getAll() {
        return departmentRepository.findAll();
    }
}
