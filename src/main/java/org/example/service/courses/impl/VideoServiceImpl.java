package org.example.service.courses.impl;

import org.example.model.courses.Document;
import org.example.model.courses.Video;
import org.example.model.courses.abstracts.Course;
import org.example.service.courses.VideoService;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class VideoServiceImpl implements VideoService {

    private static List<Video> videoList = new ArrayList<>();

    @Override
    public Optional<Video> getById(UUID uuid) {
        return Optional.empty();
    }

    @Override
    public List<Video> getByTitle(String title) {
        return null;
    }

    @Override
    public List<Video> getAll() {
        return null;
    }

    @Override
    public List<Video> getByDuration(Time duration) {
        return null;
    }
}
