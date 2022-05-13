package com.app.service;

import java.util.List;

import com.app.dto.NotesPrescribedDTO;
import com.app.entity.Prescriptionnotes;

public interface INotesPrescribedService {
	
	public void saveNotesPrescribed(Prescriptionnotes prescriptionnotes);
	
	//Find all lab notes prescriptions by Id
	public List<NotesPrescribedDTO>  getAllNotesPrescribedByPatientId(int id);
	
	//finda all
	public List<Prescriptionnotes> getAllNotes();

}
