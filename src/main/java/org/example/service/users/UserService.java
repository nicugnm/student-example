package org.example.service.users;

import org.example.model.courses.abstracts.Course;
import org.example.model.users.abstracts.User;

import java.util.List;

public interface UserService {

    List<User> getUsersByCourse(Course course);
}
