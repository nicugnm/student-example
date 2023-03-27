package org.example.service.users.impl;

import org.example.model.courses.abstracts.Course;
import org.example.model.users.abstracts.User;
import org.example.service.users.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {

    private static List<User> userList = new ArrayList<>();

    @Override
    public List<User> getUsersByCourse(Course course) {
        return userList.stream()
                .filter(singleUser -> singleUser.getCourseList().contains(course))
                .toList();
    }
}
