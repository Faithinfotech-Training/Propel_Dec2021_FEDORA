package com.app.dto;

import java.util.Date;

public class TestResultDTO {
	
	private int patientId;
	private String fullName;
	private String testCode;
	private String testName;
	
	
	
	private int labtestprescribeId;
	
	private double observedvalue;
	
	private int appoinId;
	
	private Date createdDate;

	public TestResultDTO() {
		super();
	}

	public TestResultDTO(int patientId, String fullName, String testCode, String testName, int labtestprescribeId,
			double observedvalue, int appoinId, Date createdDate) {
		super();
		this.patientId = patientId;
		this.fullName = fullName;
		this.testCode = testCode;
		this.testName = testName;
		this.labtestprescribeId = labtestprescribeId;
		this.observedvalue = observedvalue;
		this.appoinId = appoinId;
		this.createdDate = createdDate;
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

	public int getLabtestprescribeId() {
		return labtestprescribeId;
	}

	public void setLabtestprescribeId(int labtestprescribeId) {
		this.labtestprescribeId = labtestprescribeId;
	}

	public double getObservedvalue() {
		return observedvalue;
	}

	public void setObservedvalue(double observedvalue) {
		this.observedvalue = observedvalue;
	}

	public int getAppoinId() {
		return appoinId;
	}

	public void setAppoinId(int appoinId) {
		this.appoinId = appoinId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "TestResultDTO [patientId=" + patientId + ", fullName=" + fullName + ", testCode=" + testCode
				+ ", testName=" + testName + ", labtestprescribeId=" + labtestprescribeId + ", observedvalue="
				+ observedvalue + ", appoinId=" + appoinId + ", createdDate=" + createdDate + "]";
	}
	
	

}