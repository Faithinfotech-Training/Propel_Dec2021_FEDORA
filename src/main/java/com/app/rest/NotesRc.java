package com.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Notes;
import com.app.service.INotesService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class NotesRc {

	@Autowired
	private INotesService notesServ;
	
	//get all list
	@GetMapping("/notes")
	public List<Notes>getAllNotes(){
		return (List<Notes>) notesServ.getNotesList();
		
	}
	//add appointment
	@PostMapping("/notes")
	public void addNotes(@RequestBody Notes note) {
		notesServ.saveNotes(note);
	}
	
	//update notes
	@PutMapping("/notes")
	public void updateNotes(@RequestBody Notes note) {
		notesServ.saveNotes(note);
	}
}
