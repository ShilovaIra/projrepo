package com.netcracker.project.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "department")
public class Departments {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

//    @OneToOne
//    @Column(name = "parent_id")
//    @JoinColumn(referencedColumnName = "id", foreignKey = @ForeignKey(name = "FK_DEPARTMENT_PARENT_ID"))
//    private Departments parent_id;

    @OneToMany(targetEntity = Specialty.class, fetch = FetchType.EAGER, mappedBy = "department_id")
    private Set<Specialty> specialty;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Departments() {
    }

    public Departments(Long id, String name, Set<Specialty> specialty) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
    }

    public Departments(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    //    public Departments getParent_id() {
//        return parent_id;
//    }
//
//    public void setParent_id(Departments parent_id) {
//        this.parent_id = parent_id;
//    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
