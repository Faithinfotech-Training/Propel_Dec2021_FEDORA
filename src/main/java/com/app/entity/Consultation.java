package com.app.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="consultation")
public class Consultation {
	//instance variables
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int con_id;
	
	@OneToOne
	@JoinColumn(name="appointment_id")
	private Appointment apoointment;
	
	@OneToMany(mappedBy="consultation")
	private List<MedicinePrescribed> priscriptionList;
	
	@OneToMany(mappedBy="consultation")
	private List<TestPrescribed> testPriscriList;
	
	@OneToMany(mappedBy="consultation")
	private List<Notes> noteList;
	
	private String diagnosis;
	
	private boolean is_active;
	
	//default constructor
	public Consultation() {
		super();
		
	}

	public Consultation(int con_id, Appointment apoointment, List<MedicinePrescribed> priscriptionList,
			List<TestPrescribed> testPriscriList, List<Notes> noteList, String diagnosis, boolean is_active) {
		super();
		this.con_id = con_id;
		this.apoointment = apoointment;
		this.priscriptionList = priscriptionList;
		this.testPriscriList = testPriscriList;
		this.noteList = noteList;
		this.diagnosis = diagnosis;
		this.is_active = is_active;
	}

	public int getCon_id() {
		return con_id;
	}

	public void setCon_id(int con_id) {
		this.con_id = con_id;
	}

	public Appointment getApoointment() {
		return apoointment;
	}

	public void setApoointment(Appointment apoointment) {
		this.apoointment = apoointment;
	}

	public List<MedicinePrescribed> getPriscriptionList() {
		return priscriptionList;
	}

	public void setPriscriptionList(List<MedicinePrescribed> priscriptionList) {
		this.priscriptionList = priscriptionList;
	}

	public List<TestPrescribed> getTestPriscriList() {
		return testPriscriList;
	}

	public void setTestPriscriList(List<TestPrescribed> testPriscriList) {
		this.testPriscriList = testPriscriList;
	}

	public List<Notes> getNoteList() {
		return noteList;
	}

	public void setNoteList(List<Notes> noteList) {
		this.noteList = noteList;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public boolean isIs_active() {
		return is_active;
	}

	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}

	@Override
	public String toString() {
		return "Consultation [con_id=" + con_id + ", apoointment=" + apoointment + ", priscriptionList="
				+ priscriptionList + ", testPriscriList=" + testPriscriList + ", noteList=" + noteList + ", diagnosis="
				+ diagnosis + ", is_active=" + is_active + "]";
	}

	
	
	

}


