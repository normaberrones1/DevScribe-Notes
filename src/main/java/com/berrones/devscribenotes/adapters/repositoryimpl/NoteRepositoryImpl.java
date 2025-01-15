package com.berrones.devscribenotes.adapters.repositoryimpl;

import com.berrones.devscribenotes.adapters.jparepository.NoteJpaRepository;
import com.berrones.devscribenotes.domain.entity.Note;
import com.berrones.devscribenotes.ports.NoteRepository;
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
