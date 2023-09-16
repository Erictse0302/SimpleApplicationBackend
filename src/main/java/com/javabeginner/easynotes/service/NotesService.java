package com.javabeginner.easynotes.service;

import java.util.List;

import com.javabeginner.easynotes.entity.Note;


public interface NotesService {
	
	List<Note> readAll();
	
	Note saveNote(Note note);
	
	Note readNote(int id);
	
	void removeNote(int id);
}

