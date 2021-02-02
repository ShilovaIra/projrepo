package com.netcracker.project.services;

import com.netcracker.project.models.Course;

import java.util.List;

public interface CourseService {

    List<Course> getAll();
    Object getById(Long id);
}
