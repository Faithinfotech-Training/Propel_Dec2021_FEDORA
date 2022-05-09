package com.app.service;

import java.util.List;
import java.util.Optional;


import com.app.entity.Notes;

public interface INotesService {

	//list appointment
		public List<Notes> getNotesList();
		
		//insert 
		public void saveNotes(Notes notes);
		
		//Search By Id
		public Optional<Notes> getNotes(int id);
		
		//Delete
		public void deleteNotes(int id);
}
