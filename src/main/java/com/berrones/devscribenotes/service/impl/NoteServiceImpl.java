package com.berrones.devscribenotes.service.impl;

import com.berrones.devscribenotes.entity.Note;
import com.berrones.devscribenotes.repository.NoteRepository;
import com.berrones.devscribenotes.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class NoteServiceImpl implements NoteService {

    private final NoteRepository noteRepository;


    @Override
    public Note createNote(Note note) {
        return noteRepository.createNote(note);
    }

    @Override
    public Note findNoteById(UUID noteId) {
        return noteRepository.findNoteById(noteId);
    }
}
