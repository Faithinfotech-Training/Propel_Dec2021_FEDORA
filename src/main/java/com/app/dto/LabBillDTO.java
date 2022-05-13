package com.app.dto;

import java.time.LocalDate;
import com.app.entity.Appointment;

public class LabBillDTO {
	
	private int billId;
	private int appoinId;
	private int patientId;
	private String patiebtName;
	private String testName;
	private double price;
	private double billAmount;
	private  LocalDate createdDate;
	
	
	//default constructor
	public LabBillDTO() {
		super();
	}


	public LabBillDTO(int billId, int appoinId, int patientId, String patiebtName, String testName, double price,
			double billAmount, LocalDate createdDate) {
		super();
		this.billId = billId;
		this.appoinId = appoinId;
		this.patientId = patientId;
		this.patiebtName = patiebtName;
		this.testName = testName;
		this.price = price;
		this.billAmount = billAmount;
		this.createdDate = createdDate;
	}


	public int getBillId() {
		return billId;
	}


	public void setBillId(int billId) {
		this.billId = billId;
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


	public String getPatiebtName() {
		return patiebtName;
	}


	public void setPatiebtName(String patiebtName) {
		this.patiebtName = patiebtName;
	}


	public String getTestName() {
		return testName;
	}


	public void setTestName(String testName) {
		this.testName = testName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getBillAmount() {
		return billAmount;
	}


	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}


	public LocalDate getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}


	@Override
	public String toString() {
		return "LabBillDTO [billId=" + billId + ", appoinId=" + appoinId + ", patientId=" + patientId + ", patiebtName="
				+ patiebtName + ", testName=" + testName + ", price=" + price + ", billAmount=" + billAmount
				+ ", createdDate=" + createdDate + "]";
	}
	
}