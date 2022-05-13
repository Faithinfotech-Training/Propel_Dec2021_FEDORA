package com.app.entity;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name= "labtest")
public class LabTest {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int labtestId;
	
	private String testCode;
	
	private String testName;
	
	private double price;
	
	private double highRange;
	
	private double lowRange;
	
	private String unit;
	private String isActive;
	
	
	@CreationTimestamp
	@Column(name = "created_date")
	private LocalDate createdDate;


	public LabTest() {
		super();
	}


	public LabTest(int labtestId, String testCode, String testName, double price, double highRange, double lowRange,
			String unit, String isActive, LocalDate createdDate) {
		super();
		this.labtestId = labtestId;
		this.testCode = testCode;
		this.testName = testName;
		this.price = price;
		this.highRange = highRange;
		this.lowRange = lowRange;
		this.unit = unit;
		this.isActive = isActive;
		this.createdDate = createdDate;
	}



	

	public String getUnit() {
		return unit;
	}


	public void setUnit(String unit) {
		this.unit = unit;
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


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getHighRange() {
		return highRange;
	}


	public void setHighRange(double highRange) {
		this.highRange = highRange;
	}


	public double getLowRange() {
		return lowRange;
	}


	public void setLowRange(double lowRange) {
		this.lowRange = lowRange;
	}


	public String getIsActive() {
		return isActive;
	}


	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}


	public LocalDate getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}


	@Override
	public String toString() {
		return "LabTest [labtestId=" + labtestId + ", testCode=" + testCode + ", testName=" + testName + ", price="
				+ price + ", highRange=" + highRange + ", lowRange=" + lowRange + ", unit=" + unit + ", isActive="
				+ isActive + ", createdDate=" + createdDate + "]";
	}
	
	
	
	
	
}

