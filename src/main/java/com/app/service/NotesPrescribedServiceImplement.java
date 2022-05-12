package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.app.dao.INotesPrescribedRepository;
import com.app.dto.MedicinePrescribedDTO;
import com.app.dto.NotesPrescribedDTO;
import com.app.entity.Prescriptionnotes;
@Service
public class NotesPrescribedServiceImplement implements INotesPrescribedService {
	
	@Autowired
	private INotesPrescribedRepository notesPrescribedRepository ;

	//save or insert
	public void saveNotesPrescribed(Prescriptionnotes prescriptionnotes) {
		 
		notesPrescribedRepository.save(prescriptionnotes);
	}

	@Override
	public List<NotesPrescribedDTO> getAllNotesPrescribedByPatientId(int id) {
		
		return (List<NotesPrescribedDTO>) notesPrescribedRepository.getAllDTONotesPrescribedByPatientId(id);
	}

	
	public List<Prescriptionnotes> getAllNotes() {
		
		return (List<Prescriptionnotes>)notesPrescribedRepository.findAll();
	}

}
