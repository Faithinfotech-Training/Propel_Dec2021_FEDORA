package com.app.dto;

import java.util.Date;

public class PatientAppointmentDTO {
	
	private int appoinId;
	private Date doa;
	
	private int patientId;
	private String fullName;
	private String gender;
	private String bloodGroup;
	
	private String tokenNum;
	private String specialization;

	
	private String doctorName;
	
	
	
	
	public PatientAppointmentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}




	public PatientAppointmentDTO(int appoinId, Date doa, int patientId, String fullName, String gender,
			String bloodGroup, String tokenNum, String specialization, String doctorName) {
		super();
		this.appoinId = appoinId;
		this.doa = doa;
		this.patientId = patientId;
		this.fullName = fullName;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
		this.tokenNum = tokenNum;
		this.specialization = specialization;
		this.doctorName = doctorName;
	}




	public int getAppoinId() {
		return appoinId;
	}




	public void setAppoinId(int appoinId) {
		this.appoinId = appoinId;
	}




	public Date getDoa() {
		return doa;
	}




	public void setDoa(Date doa) {
		this.doa = doa;
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




	public String getGender() {
		return gender;
	}




	public void setGender(String gender) {
		this.gender = gender;
	}




	public String getBloodGroup() {
		return bloodGroup;
	}




	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}




	public String getTokenNum() {
		return tokenNum;
	}




	public void setTokenNum(String tokenNum) {
		this.tokenNum = tokenNum;
	}




	public String getSpecialization() {
		return specialization;
	}




	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}




	public String getDoctorName() {
		return doctorName;
	}




	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}




	@Override
	public String toString() {
		return "PatientAppointmentDTO [appoinId=" + appoinId + ", doa=" + doa + ", patientId=" + patientId
				+ ", fullName=" + fullName + ", gender=" + gender + ", bloodGroup=" + bloodGroup + ", tokenNum="
				+ tokenNum + ", specialization=" + specialization + ", doctorName=" + doctorName + "]";
	}
	



}