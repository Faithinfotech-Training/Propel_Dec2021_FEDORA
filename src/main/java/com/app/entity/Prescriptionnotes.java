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
@Table(name= "prescriptionnotes")
public class Prescriptionnotes {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int notesId;
	
	private String notes;
	
	private int appoinId;
	
	@ManyToOne
	@JoinColumn(name="appoinId", insertable = false, updatable = false)
	private Appointment  appointment; 
	
	
	private String isActive;
	
	
	@CreationTimestamp
	@Column(name = "created_date")
	private Date createdDate;


	public Prescriptionnotes() {
		super();
	}


	public Prescriptionnotes(int notesId, String notes, int appoinId, Appointment appointment, String isActive,
			Date createdDate) {
		super();
		this.notesId = notesId;
		this.notes = notes;
		this.appoinId = appoinId;
		this.appointment = appointment;
		this.isActive = isActive;
		this.createdDate = createdDate;
	}


	public int getNotesId() {
		return notesId;
	}


	public void setNotesId(int notesId) {
		this.notesId = notesId;
	}


	public String getNotes() {
		return notes;
	}


	public void setNotes(String notes) {
		this.notes = notes;
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
		return "Prescriptionnotes [notesId=" + notesId + ", notes=" + notes + ", appoinId=" + appoinId
				+ ", appointment=" + appointment + ", isActive=" + isActive + ", createdDate=" + createdDate + "]";
	}
	
	

}
