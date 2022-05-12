package com.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.NotesPrescribedDTO;
import com.app.entity.LabTestPrescribed;
import com.app.entity.Prescriptionnotes;
import com.app.service.INotesPrescribedService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class PrescriptionnotesRestController {
	
	@Autowired
	private INotesPrescribedService  notesPrescribedService;
	
	@GetMapping("/notesprescribed/dto/{id}")
	public List<NotesPrescribedDTO> getAllLabTestPrescribedByPatientId(@PathVariable int id){
		
		return notesPrescribedService.getAllNotesPrescribedByPatientId(id);
		
	}
	@GetMapping("/notesprescribed")
	public List<Prescriptionnotes>getAllPrecNotes(){
		return (List<Prescriptionnotes>)notesPrescribedService.getAllNotes();
		
	}

	@PostMapping("/notesprescribed")
	public void addLabTestPrescribed(@RequestBody Prescriptionnotes prescriptionnotes) {
		notesPrescribedService.saveNotesPrescribed(prescriptionnotes);;
}
}