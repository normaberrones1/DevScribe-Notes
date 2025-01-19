package com.berrones.devscribenotes.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NoteDto {

    private UUID noteId;

    private String noteTitle;

    private String noteContent;

    private OffsetDateTime createdDate;

    private OffsetDateTime updatedDate;

    private UUID userId;
}
