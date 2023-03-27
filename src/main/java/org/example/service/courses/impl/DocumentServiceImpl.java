package org.example.service.courses.impl;

import org.example.model.courses.Document;
import org.example.model.courses.abstracts.Course;
import org.example.model.courses.enums.DocumentType;
import org.example.service.courses.DocumentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class DocumentServiceImpl implements DocumentService {

    private static List<Document> documentList = new ArrayList<>();

    @Override
    public List<Document> getDocumentByDocumentType(DocumentType documentType) {
        return null;
    }

    @Override
    public Optional<Document> getById(UUID uuid) {
        return Optional.empty();
    }

    @Override
    public List<Document> getByTitle(String title) {
        return null;
    }

    @Override
    public List<Document> getAll() {
        return null;
    }
}
