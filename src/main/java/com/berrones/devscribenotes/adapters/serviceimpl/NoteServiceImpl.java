package com.berrones.devscribenotes.adapters.serviceimpl;

import com.berrones.devscribenotes.domain.entity.Note;
import com.berrones.devscribenotes.domain.entity.User;
import com.berrones.devscribenotes.domain.service.NoteService;
import com.berrones.devscribenotes.dto.NoteDto;
import com.berrones.devscribenotes.ports.NoteRepository;
import com.berrones.devscribenotes.ports.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
@Service
public class NoteServiceImpl implements NoteService {

    private final NoteRepository noteRepository;

    private final UserRepository userRepository;

    @Override
   public NoteDto createNote(NoteDto note) {
        User user = userRepository.findUserById(note.getUserId());
        Note newNote = new Note();
        newNote.setNoteTitle(note.getNoteTitle());
        newNote.setNoteContent(note.getNoteContent());
        newNote.setUser(user);
        Note savedNote = noteRepository.createNote(newNote);
        log.info("Note created: NoteID: {}, NoteEntity: {}", newNote.getNoteId(), newNote);
        note.setNoteContent(savedNote.getNoteContent());
        note.setNoteTitle(savedNote.getNoteTitle());
        note.setUserId(savedNote.getUser().getUserId());
        note.setNoteId(savedNote.getNoteId());
        note.setCreatedDate(savedNote.getCreatedDate());
        note.setUpdatedDate(savedNote.getUpdatedDate());
        return note;
    }

    @Override
    public Note findNoteById(UUID noteId) {
        return noteRepository.findNoteById(noteId);
    }

    @Override
    public Note patchNoteById(UUID noteId, Note note) {
        Note requestNote = noteRepository.findNoteById(noteId);
        if (requestNote != null) {
            Note updateNote = noteRepository.findNoteById(noteId);
            noteRepository.createNote(updateNote);
            log.info("Note updated: NoteID: {}, NoteEntity: {}", noteId, updateNote);
            return updateNote;
        } else {
            log.info("Note not found: {}", noteId);
            return null;
        }
    }
}
