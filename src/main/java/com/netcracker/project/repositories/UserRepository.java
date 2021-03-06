package com.netcracker.project.repositories;

import com.netcracker.project.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

    @Query("select u from Users u where u.login = :login")
    Users findByLogin(@Param("login") String login);

    @Override
    List<Users> findAll();
}
