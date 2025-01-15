package com.berrones.devscribenotes.repository.impl;

import com.berrones.devscribenotes.entity.Note;
import com.berrones.devscribenotes.repository.NoteRepository;
import com.berrones.devscribenotes.repository.jpa.NoteJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@RequiredArgsConstructor
@Component
public class NoteRepositoryImpl implements NoteRepository {

    private final NoteJpaRepository noteJpaRepository;

    @Override
    public Note createNote(Note note) {
        noteJpaRepository.save(note);
        return note;
    }

    @Override
    public Note findNoteById(UUID noteId) {
        return noteJpaRepository.findById(noteId).orElseThrow(() -> new RuntimeException("Note not found"));
    }
}
