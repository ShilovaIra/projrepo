package com.netcracker.project.repositories;

import com.netcracker.project.models.Departments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DepartmentRepository extends JpaRepository<Departments, Long> {

    @Query("select d from Departments d where d.name = :name")
    Departments findByName(@Param("name") String name);
}
