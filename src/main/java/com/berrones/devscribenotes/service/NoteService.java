package com.berrones.devscribenotes.service;


import com.berrones.devscribenotes.entity.Note;

import java.util.UUID;

public interface NoteService {

    Note createNote (Note note);

    Note findNoteById(UUID noteId);

}
