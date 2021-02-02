package com.netcracker.project.models;

import javax.persistence.*;

@Entity
@Table(name = "user_role")
public class UserRole {

    @EmbeddedId
    @Column(name = "id")
    private  UserRoleId linkPk = new UserRoleId();

    public UserRoleId getLinkPk() {
        return linkPk;
    }

    public void setLinkPk(UserRoleId linkPk) {
        this.linkPk = linkPk;
    }

    @Transient
    public Users getUser() {
        return getLinkPk().getUser();
    }

    @Transient
    public Departments getDepartment() {
        return getLinkPk().getDepartment();
    }

    @Transient
    public Role getRole() {
        return getLinkPk().getRole();
    }

    @Transient
    public void setUser(Users user) {
        this.linkPk.setUser(user);
    }

    @Transient
    public void setDepartment(Departments department) {
        this.linkPk.setDepartment(department);
    }

    @Transient
    public void setRole(Role role) {
        this.linkPk.setRole(role);
    }

}
