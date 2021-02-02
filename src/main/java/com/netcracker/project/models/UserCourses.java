package com.netcracker.project.models;

import javax.persistence.*;

@Entity(name = "user_course")
public class UserCourses {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "user_id")
    private Users users;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "course_id")
    private Course course;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "department_id")
    private Departments department;

    public UserCourses() {
    }

    public UserCourses(Users users, Course course, Departments departments) {
        this.users = users;
        this.course = course;
        this.department = department;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Departments getDepartments() {
        return department;
    }

    public void setDepartments(Departments departments) {
        this.department = departments;
    }
}
