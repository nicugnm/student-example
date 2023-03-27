package org.example.service.users.impl;

import org.example.model.courses.abstracts.Course;
import org.example.model.users.Student;
import org.example.service.users.StudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class StudentServiceImpl implements StudentService {

    private static List<Student> studentList = new ArrayList<>();

    @Override
    public List<Student> getUsersByCourse(Course course) {
        return null;
    }

    @Override
    public List<Course> getCoursesByStudentId(UUID studentId) {
        Optional<Student> studentOptional = getById(studentId);

        if (studentOptional.isPresent()) {
            Student student = studentOptional.get();

            return student.getCourseList();
        } else {
            return List.of();
        }
    }

    @Override
    public Optional<Student> getById(UUID uuid) {
        return studentList.stream()
                .filter(std -> std.getId().equals(uuid))
                .findAny();
    }
}
