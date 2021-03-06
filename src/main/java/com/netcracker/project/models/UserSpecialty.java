package com.netcracker.project.models;

import javax.persistence.*;

@Entity
@Table(name = "user_specialty")
public class UserSpecialty {

    @EmbeddedId
    @Column(name = "id")
    private UserSpecialtyId linkPk = new UserSpecialtyId();

    public UserSpecialtyId getLinkPk() {
        return linkPk;
    }

    public void setLinkPk(UserSpecialtyId linkPk) {
        this.linkPk = linkPk;
    }

    @Transient
    public Users getUser() {
        return getLinkPk().getUser();
    }

    @Transient
    public Course getCourse() {
        return getLinkPk().getCourse();
    }

    @Transient
    public Specialty getSpecialty() {
        return getLinkPk().getSpecialty();
    }

    @Transient
    public void setUser(Users user) {
        this.linkPk.setUser(user);
    }

    @Transient
    public void setCourse(Course course) {
        this.linkPk.setCourse(course);
    }

    @Transient
    public void setSpecialty(Specialty specialty) {
        this.linkPk.setSpecialty(specialty);
    }
}
