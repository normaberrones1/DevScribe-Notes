package com.berrones.devscribenotes.adapters.serviceimpl;

import com.berrones.devscribenotes.domain.entity.Note;
import com.berrones.devscribenotes.domain.entity.User;
import com.berrones.devscribenotes.dto.NoteDto;
import com.berrones.devscribenotes.ports.NoteRepository;
import com.berrones.devscribenotes.ports.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class NoteServiceImplTest {

    @Mock
    private NoteRepository noteRepository;

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private NoteServiceImpl noteService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCreateNote() {
        NoteDto noteDto = new NoteDto();
        noteDto.setNoteTitle("Sample Note");
        noteDto.setNoteContent("This is a sample note content.");
        noteDto.setUserId(UUID.randomUUID());

        User mockUser = new User();
        when(userRepository.findUserById(noteDto.getUserId())).thenReturn(mockUser);

        Note note = new Note();
        note.setNoteTitle(noteDto.getNoteTitle());
        note.setNoteContent(noteDto.getNoteContent());
        note.setUser(mockUser);

        when(noteRepository.createNote(any(Note.class))).thenReturn(note);

        NoteDto createdNote = noteService.createNote(noteDto);

        assertEquals("Sample Note", createdNote.getNoteTitle());
        assertEquals("This is a sample note content.", createdNote.getNoteContent());
        verify(noteRepository, times(1)).createNote(any(Note.class));
    }

    @Test
    void testFindNoteById() {
        UUID noteId = UUID.randomUUID();
        Note note = new Note();
        note.setNoteId(noteId);
        note.setNoteTitle("Sample Note");

        when(noteRepository.findNoteById(noteId)).thenReturn(note);

        Note foundNote = noteService.findNoteById(noteId);

        assertEquals(noteId, foundNote.getNoteId());
        assertEquals("Sample Note", foundNote.getNoteTitle());
        verify(noteRepository, times(1)).findNoteById(noteId);
    }

    // TODO - Fix the testPatchNoteById test
//    @Test
//    void testPatchNoteById() {
//        UUID noteId = UUID.randomUUID();
//        Note existingNote = new Note();
//        existingNote.setNoteId(noteId);
//        existingNote.setNoteTitle("Old Title");
//
//        Note updatedNote = new Note();
//        updatedNote.setNoteId(noteId);
//        updatedNote.setNoteTitle("New Title");
//
//        when(noteRepository.findNoteById(noteId)).thenReturn(existingNote);
//        when(noteRepository.createNote(any(Note.class))).thenReturn(updatedNote);
//
//        Note resultNote = noteService.patchNoteById(noteId, updatedNote);
//
//        assertEquals("New Title", resultNote.getNoteTitle());
//        verify(noteRepository, times(1)).findNoteById(noteId);
//        verify(noteRepository, times(1)).createNote(any(Note.class));
//    }
}