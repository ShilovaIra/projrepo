package com.netcracker.project.models.Role;

import com.netcracker.project.models.Users;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_seq_generator")
    @SequenceGenerator(name = "role_seq_generator", sequenceName = "roles_id_seq")
    @Column(name = "id", updatable=false, nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

//    @ManyToMany(mappedBy = "roles")
//    private List<Users> users;

    @Id
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

//    public List<Users> getUsers() {
//        return users;
//    }
//
//    public void setUsers(List<Users> users) {
//        this.users = users;
//    }
}
