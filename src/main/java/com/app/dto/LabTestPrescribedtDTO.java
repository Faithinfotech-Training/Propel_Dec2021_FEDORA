package com.app.dto;

import java.util.Date;

public class LabTestPrescribedtDTO {

	
	private int patientId;
	private String fullName;
	private String testCode;
	private String testName;
	
	private Date createdDate;
	
	private int labtestprescribeId;
	
	
	public LabTestPrescribedtDTO() {
		super();
	}


	public LabTestPrescribedtDTO(int patientId, String fullName, String testCode, String testName, Date createdDate,
			int labtestprescribeId) {
		super();
		this.patientId = patientId;
		this.fullName = fullName;
		this.testCode = testCode;
		this.testName = testName;
		this.createdDate = createdDate;
		this.labtestprescribeId = labtestprescribeId;
	}

	public LabTestPrescribedtDTO(int patientId, String testCode, String testName, Date createdDate,
			int labtestprescribeId) {
		super();
		this.patientId = patientId;
		this.testCode = testCode;
		this.testName = testName;
		this.createdDate = createdDate;
		this.labtestprescribeId = labtestprescribeId;
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


	public String getTestCode() {
		return testCode;
	}


	public void setTestCode(String testCode) {
		this.testCode = testCode;
	}


	public String getTestName() {
		return testName;
	}


	public void setTestName(String testName) {
		this.testName = testName;
	}


	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	public int getLabtestprescribeId() {
		return labtestprescribeId;
	}


	public void setLabtestprescribeId(int labtestprescribeId) {
		this.labtestprescribeId = labtestprescribeId;
	}


	@Override
	public String toString() {
		return "LabTestPrescribedtDTO [patientId=" + patientId + ", fullName=" + fullName + ", testCode=" + testCode
				+ ", testName=" + testName + ", createdDate=" + createdDate + ", labtestprescribeId="
				+ labtestprescribeId + "]";
	}


	

	
}
