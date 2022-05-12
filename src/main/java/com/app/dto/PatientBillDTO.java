package com.app.dto;

import java.time.LocalDateTime;
import java.util.Date;

public class PatientBillDTO {
	
	private int appoinId;
	
	private int patientId;
	private String fullName;
	
	private String doctorName;
	
	private double consultationfee;
	private String specialization;
	private Date createdDate;
	
	
	
	
	
	public PatientBillDTO() {
		super();
		// TODO Auto-generated constructor stub
	}





	public PatientBillDTO(int appoinId, int patientId, String fullName, String doctorName, double consultationfee,
			String specialization, Date createdDate) {
		super();
		this.appoinId = appoinId;
		this.patientId = patientId;
		this.fullName = fullName;
		this.doctorName = doctorName;
		this.consultationfee = consultationfee;
		this.specialization = specialization;
		this.createdDate = createdDate;
	}





	public int getAppoinId() {
		return appoinId;
	}





	public void setAppoinId(int appoinId) {
		this.appoinId = appoinId;
	}





	public int getPatientId() {
		return patientId;
	}





	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}





	public String getFullName() {
		return fullName;
	}





	public void setFullName(String fullName) {
		this.fullName = fullName;
	}





	public String getDoctorName() {
		return doctorName;
	}





	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}





	public double getConsultationfee() {
		return consultationfee;
	}





	public void setConsultationfee(double consultationfee) {
		this.consultationfee = consultationfee;
	}





	public String getSpecialization() {
		return specialization;
	}





	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}





	public Date getCreatedDate() {
		return createdDate;
	}





	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}





	@Override
	public String toString() {
		return "PatientBillDTO [appoinId=" + appoinId + ", patientId=" + patientId + ", fullName=" + fullName
				+ ", doctorName=" + doctorName + ", consultationfee=" + consultationfee + ", specialization="
				+ specialization + ", createdDate=" + createdDate + "]";
	}

	

}