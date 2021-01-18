package com.netcracker.project.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "group")
public class Group {

    @Id
    private Long id;

    @Column(name = "name")
    private String name;

}
