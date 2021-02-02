package com.netcracker.project.models;

import com.netcracker.project.models.Users;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_seq_generator")
    @SequenceGenerator(name = "role_seq_generator", sequenceName = "roles_id_seq")
    @Column(name = "id", updatable=false, nullable = false)
    private Long id;

    @OneToMany(mappedBy = "linkPk.role", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<UserRole> userRoles;

    @Column(name = "name")
    private String name;

    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Role() {
    }

    public Role(Set<UserRole> userRoles, String name) {
        this.userRoles = userRoles;
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
