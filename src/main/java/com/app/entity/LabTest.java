package com.app.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

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
	
	
	private String isActive;
	
	
	
	@OneToMany(mappedBy="labTest",cascade=CascadeType.ALL)
	List<LabTestPrescribed> labTestsPrescribed;
	
	
	@OneToMany(mappedBy="labTest",cascade=CascadeType.ALL)
	List<TestReport> testReport;
	
	@CreationTimestamp
	@Column(name = "created_date")
	private Date createdDate;


	public LabTest() {
		super();
	}


	public LabTest(int labtestId, String testCode, String testName, double price, double highRange, double lowRange,
			String isActive, List<LabTestPrescribed> labTestsPrescribed, List<TestReport> testReport,
			Date createdDate) {
		super();
		this.labtestId = labtestId;
		this.testCode = testCode;
		this.testName = testName;
		this.price = price;
		this.highRange = highRange;
		this.lowRange = lowRange;
		this.isActive = isActive;
		this.labTestsPrescribed = labTestsPrescribed;
		this.testReport = testReport;
		this.createdDate = createdDate;
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


	public List<LabTestPrescribed> getLabTestsPrescribed() {
		return labTestsPrescribed;
	}

	@JsonBackReference
	public void setLabTestsPrescribed(List<LabTestPrescribed> labTestsPrescribed) {
		this.labTestsPrescribed = labTestsPrescribed;
	}


	public List<TestReport> getTestReport() {
		return testReport;
	}

	@JsonBackReference
	public void setTestReport(List<TestReport> testReport) {
		this.testReport = testReport;
	}


	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	@Override
	public String toString() {
		return "LabTest [labtestId=" + labtestId + ", testCode=" + testCode + ", testName=" + testName + ", price="
				+ price + ", highRange=" + highRange + ", lowRange=" + lowRange + ", isActive=" + isActive
				+ ", labTestsPrescribed=" + labTestsPrescribed + ", testReport=" + testReport + ", createdDate="
				+ createdDate + "]";
	}



	
	
	
	
	
	
}
