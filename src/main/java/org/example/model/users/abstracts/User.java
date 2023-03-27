package org.example.model.users.abstracts;

import org.example.model.courses.abstracts.Course;

import java.util.List;
import java.util.UUID;

public abstract class User {

    private UUID id;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private List<Course> courseList;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
}
