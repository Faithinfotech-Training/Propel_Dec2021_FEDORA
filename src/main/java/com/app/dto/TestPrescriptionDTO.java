package com.app.dto;

public class TestPrescriptionDTO {
	
	private int labtestprescribeId;
	private int labtestId;
	private String testCode;
	private String testName;
	public TestPrescriptionDTO() {
		super();
	}
	public TestPrescriptionDTO(int labtestprescribeId, int labtestId, String testCode, String testName) {
		super();
		this.labtestprescribeId = labtestprescribeId;
		this.labtestId = labtestId;
		this.testCode = testCode;
		this.testName = testName;
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
	@Override
	public String toString() {
		return "TestPrescriptionDTO [labtestprescribeId=" + labtestprescribeId + ", labtestId=" + labtestId
				+ ", testCode=" + testCode + ", testName=" + testName + "]";
	}
	
	
	
	
	
	
	

}
