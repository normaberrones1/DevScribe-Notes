package com.berrones.devscribenotes.repository;

import com.berrones.devscribenotes.entity.Note;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public interface NoteRepository {

    Note createNote (Note note);

    Note findNoteById(UUID noteId);

}
