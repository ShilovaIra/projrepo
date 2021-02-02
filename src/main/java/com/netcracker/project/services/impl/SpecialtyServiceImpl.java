package com.netcracker.project.services.impl;

import com.netcracker.project.models.Specialty;
import com.netcracker.project.repositories.SpecialtyRepository;
import com.netcracker.project.services.SpecialtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecialtyServiceImpl implements SpecialtyService {
    @Autowired
    private SpecialtyRepository specialtyRepository;

    @Override
    public Specialty addSpecialty(Specialty specialty) {
        Specialty savedSpecialty = specialtyRepository.saveAndFlush(specialty);
        return savedSpecialty;
    }

    @Override
    public void delete(Long id) {
        specialtyRepository.deleteById(id);
    }

    @Override
    public Object getById(Long id) {
        return specialtyRepository.findById(id);
    }

//    @Override
//    public List<Specialty> getByDepartment_id(Long id) {
//        return specialtyRepository.findByDepartment_Id(id);
//    }

    @Override
    public Specialty getByName(String name) {
        return specialtyRepository.findByName(name);
    }

    @Override
    public List<Specialty> getAll() {
        return specialtyRepository.findAll();
    }
}
