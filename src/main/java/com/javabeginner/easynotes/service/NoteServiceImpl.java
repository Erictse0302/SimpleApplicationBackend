package com.javabeginner.easynotes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabeginner.easynotes.NoteReposity.NoteRepository;
import com.javabeginner.easynotes.entity.Note;

@Service
public class NoteServiceImpl implements NotesService {
	
	@Autowired
	private NoteRepository noteRepository;

	@Override
	public List<Note> readAll() {
		return noteRepository.findAll();
	}

	@Override
	public Note saveNote(Note note) {
		return noteRepository.save(note);
	}
	@Override
	public Note readNote(int id) {
		
		return noteRepository.findById((long) id).
				orElseThrow(()-> new RuntimeException("Note is not present the id"+id));
	}

	@Override
	public void removeNote(int id) {
		Note existingNote = readNote(id);
		noteRepository .delete(existingNote);
	}
}
