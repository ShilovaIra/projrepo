package com.netcracker.project.models;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "course")
public class Course {
    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "course", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<UserCourses> userCourses;

    @OneToMany(mappedBy = "course", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<UserSpecialty> userSpecialties;

    public Course() {
    }

    public Course(String name, Set<UserCourses> userCourses, Set<UserSpecialty> userSpecialties) {
        this.name = name;
        this.userCourses = userCourses;
        this.userSpecialties = userSpecialties;
    }

    public Set<UserCourses> getUserCourses() {
        return userCourses;
    }

    public void setUserCourses(Set<UserCourses> userCourses) {
        this.userCourses = userCourses;
    }

    public Set<UserSpecialty> getUserSpecialties() {
        return userSpecialties;
    }

    public void setUserSpecialties(Set<UserSpecialty> userSpecialties) {
        this.userSpecialties = userSpecialties;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
