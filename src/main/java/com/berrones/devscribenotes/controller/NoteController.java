package com.berrones.devscribenotes.controller;

import com.berrones.devscribenotes.entity.Note;
import com.berrones.devscribenotes.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;

@RestController
@RequestMapping("/note")
@RequiredArgsConstructor
public class NoteController {

    private final NoteService noteService;

    @PostMapping
    public Note createNote(@RequestBody Note note) {
        return noteService.createNote(note);
    }

    @GetMapping("/{id}")
    public Note findNoteById(@PathVariable UUID id) {
        return noteService.findNoteById(id);
    }


}
