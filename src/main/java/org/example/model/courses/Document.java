package org.example.model.courses;

import org.example.model.courses.abstracts.Course;
import org.example.model.courses.enums.DocumentType;

import java.time.LocalDate;
import java.util.UUID;

public class Document extends Course {

    private DocumentType documentType;
}
