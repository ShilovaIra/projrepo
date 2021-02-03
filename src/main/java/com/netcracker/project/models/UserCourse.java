package com.netcracker.project.models;

import javax.persistence.*;

@Entity
@Table(name = "user_course")
public class UserCourse {

    @EmbeddedId
    @Column(name = "id")
    private UserCourseId linkPk = new UserCourseId();

    public UserCourseId getLinkPk() {
        return linkPk;
    }

    public void setLinkPk(UserCourseId linkPk) {
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
    public Course getCourse() {
        return getLinkPk().getCourse();
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
    public void setCourse(Course course) {
        this.linkPk.setCourse(course);
    }

}
