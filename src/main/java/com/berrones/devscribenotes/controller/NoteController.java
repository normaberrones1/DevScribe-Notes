package com.berrones.devscribenotes.controller;

import com.berrones.devscribenotes.domain.entity.Note;
import com.berrones.devscribenotes.domain.service.NoteService;
import com.berrones.devscribenotes.dto.NoteDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@RestController
@RequestMapping("/note")
public class NoteController {

    private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @PostMapping
    public NoteDto createNote(@RequestBody NoteDto note) {
        return noteService.createNote(note);
    }

    @GetMapping("/{id}")
    public Note findNoteById(@PathVariable UUID id) {
        return noteService.findNoteById(id);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Note> updateNote(@PathVariable UUID id, @RequestBody Note note) {
       Note requestNote = noteService.findNoteById(id);
       if (requestNote != null) {
              return ResponseEntity.ok(noteService.patchNoteById(id, note));
         } else {
              return ResponseEntity.notFound().build();
       }

    }
}
