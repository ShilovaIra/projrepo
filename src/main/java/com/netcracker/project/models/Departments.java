package com.netcracker.project.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "department")
public class Departments {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "linkPk.department", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<UserRole> userRoles;

    @OneToMany(mappedBy = "linkPk.department", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<UserCourse> userCourse;

    @OneToMany(mappedBy = "department", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Specialty> specialties;

    @OneToOne
    @JoinColumn(name = "parent_id", referencedColumnName = "id")
    private Departments department;

    public Departments() {
    }

    public Departments(String name, Set<UserRole> userRoles, Set<UserCourse> userCourse, Set<Specialty> specialties) {
        this.name = name;
        this.userRoles = userRoles;
        this.userCourse = userCourse;
        this.specialties = specialties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

}
