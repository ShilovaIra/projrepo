package com.netcracker.project.services.impl;

import com.netcracker.project.models.Course;
import com.netcracker.project.repositories.CourseRepository;
import com.netcracker.project.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> getAll() {
        return courseRepository.findAll();
    }

    @Override
    public Object getById(Long id) {
        return courseRepository.findById(id);
    }
}
