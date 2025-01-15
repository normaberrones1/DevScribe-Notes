package com.berrones.devscribenotes.domain.service;


import com.berrones.devscribenotes.domain.entity.Note;

import java.util.UUID;

public interface NoteService {

    Note createNote (Note note);

    Note findNoteById(UUID noteId);

}
