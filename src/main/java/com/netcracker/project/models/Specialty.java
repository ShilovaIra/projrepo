package com.netcracker.project.models;

import javax.persistence.*;

@Entity
@Table(name = "specialty")
public class Specialty {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "department_id",nullable = false)
    private Departments departments;

    public Specialty() {
    }

    public Specialty(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Specialty(Long id, String name, Departments departments) {
        this.id = id;
        this.name = name;
        this.departments = departments;
    }

    public Departments getDepartments() {
        return departments;
    }

    public void setDepartments(Departments departments) {
        this.departments = departments;
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
