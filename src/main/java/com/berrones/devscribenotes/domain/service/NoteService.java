package com.berrones.devscribenotes.domain.service;


import com.berrones.devscribenotes.domain.entity.Note;
import com.berrones.devscribenotes.dto.NoteDto;

import java.util.UUID;

public interface NoteService {

    NoteDto createNote (NoteDto note);

    Note findNoteById(UUID noteId);

    Note patchNoteById(UUID noteId, Note note);
}
