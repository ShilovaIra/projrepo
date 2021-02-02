package com.netcracker.project.services;

import com.netcracker.project.models.Specialty;

import java.util.List;

public interface SpecialtyService {

    Specialty addSpecialty(Specialty specialty);
    void delete(Long id);
    Object getById(Long id);
//    List<Specialty> getByDepartment_id(Long id);
    Specialty getByName(String name);
    List<Specialty> getAll();
}
