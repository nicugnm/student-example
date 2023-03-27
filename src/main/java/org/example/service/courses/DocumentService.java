package org.example.service.courses;

import org.example.model.courses.Document;
import org.example.model.courses.abstracts.Course;
import org.example.model.courses.enums.DocumentType;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface DocumentService {

    List<Document> getDocumentByDocumentType(DocumentType documentType);

    Optional<Document> getById(UUID uuid); // id-ul este unic si cum optional incapsuleaza un singur obiect, o sa avem Optional<Course>

    List<Document> getByTitle(String title); // daca am mai multe carti cu acelasi titlu returneaza o lista

    List<Document> getAll();
}
