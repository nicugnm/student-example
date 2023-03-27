package org.example.model.courses.abstracts;

import org.example.model.courses.Document;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public abstract class Course {

    private UUID id;

    private String title;

    private String description;

    private LocalDate creationDate;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}