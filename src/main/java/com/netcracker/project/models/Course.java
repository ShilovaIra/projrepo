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

    @OneToMany(mappedBy = "linkPk.course", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<UserCourse> userCourse;

    @OneToMany(mappedBy = "linkPk.course", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<UserSpecialty> userSpecialty;

    public Course() {
    }

    public Set<UserCourse> getUserCourse() {
        return userCourse;
    }

    public void setUserCourse(Set<UserCourse> userCourse) {
        this.userCourse = userCourse;
    }

    public Course(String name, Set<UserCourse> userCourse, Set<UserSpecialty> userSpecialties) {
        this.name = name;
        this.userCourse = userCourse;
        this.userSpecialty = userSpecialties;
    }

    public Set<UserSpecialty> getUserSpecialties() {
        return userSpecialty;
    }

    public void setUserSpecialties(Set<UserSpecialty> userSpecialty) {
        this.userSpecialty = userSpecialty;
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
