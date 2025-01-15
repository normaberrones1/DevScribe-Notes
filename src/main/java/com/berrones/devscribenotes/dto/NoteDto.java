package com.berrones.devscribenotes.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class NoteDto {

    private UUID noteId;

    private String noteTitle;

    private String noteContent;
}
