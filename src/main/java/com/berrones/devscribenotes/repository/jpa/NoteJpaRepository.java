package com.berrones.devscribenotes.repository.jpa;

import com.berrones.devscribenotes.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface NoteJpaRepository extends JpaRepository<Note, UUID> {



}
