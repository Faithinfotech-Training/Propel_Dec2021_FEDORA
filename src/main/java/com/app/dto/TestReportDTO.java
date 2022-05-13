package com.app.dto;

public class TestReportDTO {


	private int appoinId;
	private int patientId;
	private String patientName;
	private int age;
	private String mobileno;
	private String gender;
	private String bloodGroup;
	private String email;
	private int reportId;
	private int labtestId;
	private double obtainedValue;
	private String notes;
	public TestReportDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TestReportDTO(int appoinId, int patientId, String patientName, int age, String mobileno, String gender,
			String bloodGroup, String email, int reportId, int labtestId, double obtainedValue, String notes) {
		super();
		this.appoinId = appoinId;
		this.patientId = patientId;
		this.patientName = patientName;
		this.age = age;
		this.mobileno = mobileno;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
		this.email = email;
		this.reportId = reportId;
		this.labtestId = labtestId;
		this.obtainedValue = obtainedValue;
		this.notes = notes;
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
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	@Override
	public String toString() {
		return "TestReportDTO [appoinId=" + appoinId + ", patientId=" + patientId + ", patientName=" + patientName
				+ ", age=" + age + ", mobileno=" + mobileno + ", gender=" + gender + ", bloodGroup=" + bloodGroup
				+ ", email=" + email + ", reportId=" + reportId + ", labtestId=" + labtestId + ", obtainedValue="
				+ obtainedValue + ", notes=" + notes + "]";
	}

	


}
