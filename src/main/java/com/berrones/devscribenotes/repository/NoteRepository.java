package com.berrones.devscribenotes.repository;

import com.berrones.devscribenotes.entity.Note;

import java.util.ArrayList;
import java.util.UUID;

public interface NoteRepository {

    Note findById(UUID noteId);

    Note save(Note note);

    void deleteById(UUID noteId);

}
