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
@Table(name= "labtestPrescribed")
public class LabTestPrescribed {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int labtestprescribeId;
	
	
	private int labtestId;
	
	
	@ManyToOne
	@JoinColumn(name="labtestId", insertable = false, updatable = false)
	private LabTest  labTest; 
	
	private int appoinId;
	
	
	@ManyToOne
	@JoinColumn(name="appoinId", insertable = false, updatable = false)
	private Appointment  appointment; 
	
	
	private String isActive;
	
	
	@CreationTimestamp
	@Column(name = "created_date")
	private Date createdDate;


	public LabTestPrescribed() {
		super();
	}


	public LabTestPrescribed(int labtestprescribeId, int labtestId, LabTest labTest, int appoinId,
			Appointment appointment, String isActive, Date createdDate) {
		super();
		this.labtestprescribeId = labtestprescribeId;
		this.labtestId = labtestId;
		this.labTest = labTest;
		this.appoinId = appoinId;
		this.appointment = appointment;
		this.isActive = isActive;
		this.createdDate = createdDate;
	}


	public int getLabtestprescribeId() {
		return labtestprescribeId;
	}


	public void setLabtestprescribeId(int labtestprescribeId) {
		this.labtestprescribeId = labtestprescribeId;
	}


	public int getLabtestId() {
		return labtestId;
	}


	public void setLabtestId(int labtestId) {
		this.labtestId = labtestId;
	}

	@JsonBackReference
	public LabTest getLabTest() {
		return labTest;
	}


	public void setLabTest(LabTest labTest) {
		this.labTest = labTest;
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
		return "LabTestPrescribed [labtestprescribeId=" + labtestprescribeId + ", labtestId=" + labtestId + ", labTest="
				+ labTest + ", appoinId=" + appoinId + ", appointment=" + appointment + ", isActive=" + isActive
				+ ", createdDate=" + createdDate + "]";
	}

	
	
	

}
