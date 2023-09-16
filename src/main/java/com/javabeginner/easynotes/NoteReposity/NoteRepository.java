package com.javabeginner.easynotes.NoteReposity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javabeginner.easynotes.entity.Note;

public interface NoteRepository extends JpaRepository <Note,Long> {

	
}
