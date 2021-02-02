package com.netcracker.project.repositories;

import com.netcracker.project.models.Specialty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SpecialtyRepository extends JpaRepository<Specialty, Long> {

    @Query("select s from Specialty s where s.name = :name")
    Specialty findByName(@Param("name") String name);

//    @Query("select s from Specialty s where s.department = :id")
//    List<Specialty> findByDepartment_Id(@Param("id") Long id);
}
