package com.netcracker.project.services;

import com.netcracker.project.models.Departments;

import java.util.List;

public interface DepartmentService {

    Departments addDepartment(Departments department);
    void delete(Departments departments);
    Object getById(Long id);
    Departments getByName(String name);
    List<Departments> getAll();

}
