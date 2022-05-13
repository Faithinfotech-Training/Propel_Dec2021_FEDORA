package com.app.entity;

import java.time.LocalDate;
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
@Table(name= "testReport")
public class TestReport {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int reportId;
	
	private int labtestId;
	
	@ManyToOne
	@JoinColumn(name="labtestId", insertable = false, updatable = false)
	private LabTest  labTest;
	private double obtainedValue;
	private int appoinId;
	
	@ManyToOne
	@JoinColumn(name="appoinId", insertable = false, updatable = false)
	private Appointment  appointment;
	
	private String notes;
	
	private String isActive;
	
	
	@CreationTimestamp
	@Column(name = "created_date")
	private LocalDate createdDate;


	public TestReport() {
		super();
	}


	
	public int getReportId() {
		return reportId;
	}



	public void setReportId(int reportId) {
		this.reportId = reportId;
	}



	public int getLabtestId() {
		return labtestId;
	}



	public void setLabtestId(int labtestId) {
		this.labtestId = labtestId;
	}



	public double getObtainedValue() {
		return obtainedValue;
	}



	public void setObtainedValue(double obtainedValue) {
		this.obtainedValue = obtainedValue;
	}



	public int getAppoinId() {
		return appoinId;
	}



	public void setAppoinId(int appoinId) {
		this.appoinId = appoinId;
	}



	public Appointment getAppointment() {
		return appointment;
	}



	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}



	public String getNotes() {
		return notes;
	}



	public void setNotes(String notes) {
		this.notes = notes;
	}



	public String getIsActive() {
		return isActive;
	}



	public void setIsActive(String isActive) {
		this.isActive = "y";
	}



	public LocalDate getCreatedDate() {
		return createdDate;
	}



	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	@JsonBackReference
	public LabTest getLabTest() {
		return labTest;
	}


	public void setLabTest(LabTest labTest) {
		this.labTest = labTest;
	}



	public TestReport(int reportId, int labtestId, LabTest labTest, double obtainedValue, int appoinId,
			Appointment appointment, String notes, String isActive, LocalDate createdDate) {
		super();
		this.reportId = reportId;
		this.labtestId = labtestId;
		this.labTest = labTest;
		this.obtainedValue = obtainedValue;
		this.appoinId = appoinId;
		this.appointment = appointment;
		this.notes = notes;
		this.isActive = isActive;
		this.createdDate = createdDate;
	}



	@Override
	public String toString() {
		return "TestReport [reportId=" + reportId + ", labtestId=" + labtestId + ", labTest=" + labTest
				+ ", obtainedValue=" + obtainedValue + ", appoinId=" + appoinId + ", appointment=" + appointment
				+ ", notes=" + notes + ", isActive=" + isActive + ", createdDate=" + createdDate + "]";
	}





}
