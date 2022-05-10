package com.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="medicine_prescription")
public class MedicinePrescribed {
	//instance variables
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int medPres_id;
	
	private Integer con_id;
	@ManyToOne
	@JoinColumn(name="con_id",insertable = false, updatable = false)
	private Consultation consultation;
	
	@OneToOne
	@JoinColumn(name="medicine_id",insertable = false, updatable = false)
	private MedicineList med;
	
	
	
	private String dosage;


//default constructor
	public MedicinePrescribed() {
		super();
		
	}


	public MedicinePrescribed(int medPres_id, Integer con_id, Consultation consultation, MedicineList med,
			String dosage) {
		super();
		this.medPres_id = medPres_id;
		this.con_id = con_id;
		this.consultation = consultation;
		this.med = med;
		this.dosage = dosage;
	}


	public int getMedPres_id() {
		return medPres_id;
	}


	public void setMedPres_id(int medPres_id) {
		this.medPres_id = medPres_id;
	}


	public Integer getCon_id() {
		return con_id;
	}


	public void setCon_id(Integer con_id) {
		this.con_id = con_id;
	}

	@JsonBackReference
	public Consultation getConsultation() {
		return consultation;
	}


	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}


	public MedicineList getMed() {
		return med;
	}


	public void setMed(MedicineList med) {
		this.med = med;
	}


	public String getDosage() {
		return dosage;
	}


	public void setDosage(String dosage) {
		this.dosage = dosage;
	}


	@Override
	public String toString() {
		return "MedicinePrescribed [medPres_id=" + medPres_id + ", con_id=" + con_id + ", consultation=" + consultation
				+ ", med=" + med + ", dosage=" + dosage + "]";
	}

	
	
	

}
