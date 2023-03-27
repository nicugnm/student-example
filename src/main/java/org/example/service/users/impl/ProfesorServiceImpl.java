package org.example.service.users.impl;

import org.example.model.courses.abstracts.Course;
import org.example.model.users.Profesor;
import org.example.service.users.ProfesorService;

import java.util.ArrayList;
import java.util.List;

public class ProfesorServiceImpl implements ProfesorService {

    private static List<Profesor> profesorList = new ArrayList<>();

    @Override
    public List<Profesor> getUsersByCourse(Course course) {
        return null;
    }
}
