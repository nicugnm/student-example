package org.example.service.users;

import org.example.model.courses.abstracts.Course;
import org.example.model.users.Student;
import org.example.model.users.abstracts.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface StudentService {

    List<Student> getUsersByCourse(Course course);

    List<Course> getCoursesByStudentId(UUID uuid);

    Optional<Student> getById(UUID uuid);
}
