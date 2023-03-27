package org.example.service.courses;

import org.example.model.courses.Video;
import org.example.model.courses.abstracts.Course;

import java.sql.Time;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface VideoService {

    List<Video> getByDuration(Time duration);

    Optional<Video> getById(UUID uuid); // id-ul este unic si cum optional incapsuleaza un singur obiect, o sa avem Optional<Course>

    List<Video> getByTitle(String title); // daca am mai multe carti cu acelasi titlu returneaza o lista

    List<Video> getAll();
}
