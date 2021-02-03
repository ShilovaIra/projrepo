package com.netcracker.project.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
public class Users implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_seq_generator")
    @SequenceGenerator(name = "users_seq_generator", sequenceName = "users_id_seq")
    @Column(name = "id", updatable=false, nullable = false)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String first_name;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "patronymic", nullable = false)
    private String patronymic;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone", nullable = false)
    private Long phone;

    @Column(name = "login", nullable = false)
    private String login;

    @OneToMany(mappedBy = "linkPk.user", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<UserRole> userRoles;

    @OneToMany(mappedBy = "linkPk.user", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<UserCourse> userCourse;

    @OneToMany(mappedBy = "linkPk.user", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<UserSpecialty> userSpecialty;


    public Users() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }


    public Users(Long id, String first_name) {
        this.id = id;
        this.first_name = first_name;
    }

    public Users(String first_name, String surname, String patronymic, String email, Long phone, String login, Set<UserRole> userRoles, Set<UserCourse> userCourse, Set<UserSpecialty> userSpecialty) {
        this.first_name = first_name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.email = email;
        this.phone = phone;
        this.login = login;
        this.userRoles = userRoles;
        this.userCourse = userCourse;
        this.userSpecialty = userSpecialty;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

}

