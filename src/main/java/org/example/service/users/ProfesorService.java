package org.example.service.users;

import org.example.model.courses.abstracts.Course;
import org.example.model.users.Profesor;
import org.example.model.users.Student;

import java.util.List;

public interface ProfesorService {

    List<Profesor> getUsersByCourse(Course course);
}
