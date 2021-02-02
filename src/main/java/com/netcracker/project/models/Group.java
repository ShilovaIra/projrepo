package com.netcracker.project.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "groups")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "groups_seq_generator")
    @SequenceGenerator(name = "groups_seq_generator", sequenceName = "group_id_seq")
    @Column(name = "id", updatable=false, nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    public Group() {
    }

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
}
