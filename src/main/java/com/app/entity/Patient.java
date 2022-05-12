package com.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name= "patient")
public class Patient {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int patientId;
	
	
	private String fullName;
	
	private Date dob;
	
	
	private String mobileno;
	
	
	private String gender;
	
	private String bloodGroup;
	
	private String address;
	
	private String email;
	
	
	private int staffId;
	
	
	private String isActive;
	
	@ManyToOne
	@JoinColumn(name="staffId", insertable = false, updatable = false)
	private Staff staff;
	
	
	@CreationTimestamp
	@Column(name = "created_date")
	private Date createdDate;


	public Patient() {
		super();
	}


	public Patient(int patientId, String fullName, Date dob, String mobileno, String gender, String bloodGroup,
			String address, String email, int staffId, String isActive, Staff staff, Date createdDate) {
		super();
		this.patientId = patientId;
		this.fullName = fullName;
		this.dob = dob;
		this.mobileno = mobileno;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
		this.address = address;
		this.email = email;
		this.staffId = staffId;
		this.isActive = isActive;
		this.staff = staff;
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


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
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


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getStaffId() {
		return staffId;
	}


	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}


	public String getIsActive() {
		return isActive;
	}


	public void setIsActive(String isActive) {
		this.isActive = "y";
	}

	@JsonBackReference
	public Staff getStaff() {
		return staff;
	}


	public void setStaff(Staff staff) {
		this.staff = staff;
	}


	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", fullName=" + fullName + ", dob=" + dob + ", mobileno=" + mobileno
				+ ", gender=" + gender + ", bloodGroup=" + bloodGroup + ", address=" + address + ", email=" + email
				+ ", staffId=" + staffId + ", isActive=" + isActive + ", staff=" + staff + ", createdDate="
				+ createdDate + "]";
	}
	
	
	
	

}