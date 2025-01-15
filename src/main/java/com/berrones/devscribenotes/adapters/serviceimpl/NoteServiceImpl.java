package com.berrones.devscribenotes.adapters.serviceimpl;

import com.berrones.devscribenotes.domain.entity.Note;
import com.berrones.devscribenotes.ports.NoteRepository;
import com.berrones.devscribenotes.domain.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Service
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
