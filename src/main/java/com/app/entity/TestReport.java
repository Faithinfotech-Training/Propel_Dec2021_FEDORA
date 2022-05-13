package com.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name= "testreport")
public class TestReport {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int reportId;
	
	private int labtestId;
	
	
	
	@ManyToOne
	@JoinColumn(name="labtestId", insertable = false, updatable = false)
	private LabTest  labTest;
	
	private int appoinId;
	
	private double observedvalue;
	
	@ManyToOne
	@JoinColumn(name="appoinId", insertable = false, updatable = false)
	private Appointment  appointment;
	
	
	private int labtestprescribeId;
	
	@OneToOne
	@JoinColumn(name="labtestprescribeId", insertable = false, updatable = false)
	private LabTestPrescribed labTestPrescribed;
	
	
	
	
	
	
	private String notes;
	
	private String isActive;
	
	
	@CreationTimestamp
	@Column(name = "created_date")
	private Date createdDate;


	public TestReport() {
		super();
	}


	public TestReport(int reportId, int labtestId, LabTest labTest, int appoinId, double observedvalue,
			Appointment appointment, int labtestprescribeId, LabTestPrescribed labTestPrescribed, String notes,
			String isActive, Date createdDate) {
		super();
		this.reportId = reportId;
		this.labtestId = labtestId;
		this.labTest = labTest;
		this.appoinId = appoinId;
		this.observedvalue = observedvalue;
		this.appointment = appointment;
		this.labtestprescribeId = labtestprescribeId;
		this.labTestPrescribed = labTestPrescribed;
		this.notes = notes;
		this.isActive = isActive;
		this.createdDate = createdDate;
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


	public double getObservedvalue() {
		return observedvalue;
	}


	public void setObservedvalue(double observedvalue) {
		this.observedvalue = observedvalue;
	}

	@JsonBackReference
	public Appointment getAppointment() {
		return appointment;
	}


	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}


	public int getLabtestprescribeId() {
		return labtestprescribeId;
	}


	public void setLabtestprescribeId(int labtestprescribeId) {
		this.labtestprescribeId = labtestprescribeId;
	}

	@JsonBackReference
	public LabTestPrescribed getLabTestPrescribed() {
		return labTestPrescribed;
	}


	public void setLabTestPrescribed(LabTestPrescribed labTestPrescribed) {
		this.labTestPrescribed = labTestPrescribed;
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
		return "TestReport [reportId=" + reportId + ", labtestId=" + labtestId + ", labTest=" + labTest + ", appoinId="
				+ appoinId + ", observedvalue=" + observedvalue + ", appointment=" + appointment
				+ ", labtestprescribeId=" + labtestprescribeId + ", labTestPrescribed=" + labTestPrescribed + ", notes="
				+ notes + ", isActive=" + isActive + ", createdDate=" + createdDate + "]";
	}


	
	
	

}
