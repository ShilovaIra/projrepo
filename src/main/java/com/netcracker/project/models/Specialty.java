package com.netcracker.project.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "specialty")
public class Specialty {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "linkPk.specialty", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<UserSpecialty> userSpecialties;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "department_id", nullable = false)
    private Departments department;

    public Specialty() {
    }

    public Specialty(String name, Set<UserSpecialty> userSpecialty, Departments department) {
        this.name = name;
        this.userSpecialties = userSpecialty;
        this.department = department;
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
