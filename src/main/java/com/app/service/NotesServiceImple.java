package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.INotesRepo;
import com.app.entity.Notes;

@Service
public class NotesServiceImple implements INotesService{
	@Autowired
	private INotesRepo notesRepo;

	//list all
	public List<Notes> getNotesList() {
		
		return ( List<Notes>) notesRepo.findAll();
	}

	//insert and update
	public void saveNotes(Notes notes) {
		notesRepo.save(notes);
		
	}

	//search by id
	public Optional<Notes> getNotes(int id) {
		
		return notesRepo.findById(id);
	}

	//delet by id
	public void deleteNotes(int id) {
		notesRepo.deleteById(id);
		
	}

}
