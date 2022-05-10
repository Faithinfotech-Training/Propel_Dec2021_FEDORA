package com.app.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="notes")
public class Notes {
	//instance variable
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int note_id;
	
	//private int doc_id;
	
	
	@ManyToOne
	@JoinColumn(name="con_id",insertable = false, updatable = false)
	private Consultation consultation;
	
	private String notes;
	
	private LocalDate created_on;

	//default constructor
	public Notes() {
		
	}
// parameterized constructor
	public Notes(int note_id, /*int doc_id,*/ Consultation consultation, String notes, LocalDate created_on) {
		super();
		this.note_id = note_id;
		//this.doc_id = doc_id;
		this.consultation = consultation;
		this.notes = notes;
		this.created_on = created_on;
	}
	
	//getters and setters

	public int getNote_id() {
		return note_id;
	}

	public void setNote_id(int note_id) {
		this.note_id = note_id;
	}

	/*public int getDoc_id() {
		return doc_id;
	}

	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}*/
	@JsonBackReference
	public Consultation getConsultation() {
		return consultation;
	}

	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public LocalDate getCreated_on() {
		return created_on;
	}

	public void setCreated_on(LocalDate created_on) {
		this.created_on = created_on;
	}

	@Override
	public String toString() {
		return "Notes [note_id=" + note_id + /*", doc_id=" + doc_id +*/ ", consultation=" + consultation + ", notes="
				+ notes + ", created_on=" + created_on + "]";
	}

	
	
}
