package com.berrones.devscribenotes.repository.jpa;

import com.berrones.devscribenotes.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteJpaRepository extends JpaRepository<Note, Long> {

}
