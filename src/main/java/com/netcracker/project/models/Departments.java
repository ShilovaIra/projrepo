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

    @OneToMany(mappedBy = "department", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<UserCourses> userCourses;

    @OneToMany(mappedBy = "department", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Specialty> specialties;

    @OneToOne
    @JoinColumn(name = "parent_id", referencedColumnName = "id")
    private Departments department;

    public Departments() {
    }

    public Departments(String name, Set<UserRole> userRoles, Set<UserCourses> userCourses, Set<Specialty> specialties) {
        this.name = name;
        this.userRoles = userRoles;
        this.userCourses = userCourses;
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
