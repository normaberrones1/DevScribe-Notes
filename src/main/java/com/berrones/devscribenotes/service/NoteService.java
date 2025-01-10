package com.berrones.devscribenotes.service;

import com.berrones.devscribenotes.entity.Note;
import com.berrones.devscribenotes.repository.jpa.NoteJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NoteService {

    private final NoteJpaRepository noteRepository;

    public void createNote(Note note) {
        noteRepository.save(note);
    }
}
