package com.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name= "medicinePrescribed")
public class MedicinePrescribed {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int medprescribeId;
	
	
	private int medicineId;
	
	@ManyToOne
	@JoinColumn(name="medicineId", insertable = false, updatable = false)
	private Medicine  medicine; 
	
	private String dosage;
	
	private String course;
	
	
	private int appoinId;
	
	@ManyToOne
	@JoinColumn(name="appoinId", insertable = false, updatable = false)
	private Appointment  appointment; 
	
	
	private String isActive;
	
	
	@CreationTimestamp
	@Column(name = "created_date")
	private Date createdDate;


	public MedicinePrescribed() {
		super();
	}


	public MedicinePrescribed(int medprescribeId, int medicineId, Medicine medicine, String dosage, String course,
			int appoinId, Appointment appointment, String isActive, Date createdDate) {
		super();
		this.medprescribeId = medprescribeId;
		this.medicineId = medicineId;
		this.medicine = medicine;
		this.dosage = dosage;
		this.course = course;
		this.appoinId = appoinId;
		this.appointment = appointment;
		this.isActive = isActive;
		this.createdDate = createdDate;
	}


	public int getMedprescribeId() {
		return medprescribeId;
	}


	public void setMedprescribeId(int medprescribeId) {
		this.medprescribeId = medprescribeId;
	}


	public int getMedicineId() {
		return medicineId;
	}


	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}

	@JsonBackReference
	public Medicine getMedicine() {
		return medicine;
	}


	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}


	public String getDosage() {
		return dosage;
	}


	public void setDosage(String dosage) {
		this.dosage = dosage;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public int getAppoinId() {
		return appoinId;
	}


	public void setAppoinId(int appoinId) {
		this.appoinId = appoinId;
	}

	@JsonBackReference
	public Appointment getAppointment() {
		return appointment;
	}


	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}


	public String getIsActive() {
		return isActive;
	}


	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}


	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	@Override
	public String toString() {
		return "MedicinePrescribed [medprescribeId=" + medprescribeId + ", medicineId=" + medicineId + ", medicine="
				+ medicine + ", dosage=" + dosage + ", course=" + course + ", appoinId=" + appoinId + ", appointment="
				+ appointment + ", isActive=" + isActive + ", createdDate=" + createdDate + "]";
	}
	
	
}
