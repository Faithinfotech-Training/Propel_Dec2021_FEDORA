package com.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name= "doctor")
public class Doctor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int docId;
	
	
	private int staffId;
	
	@OneToOne
	@JoinColumn(name="staffId", insertable = false, updatable = false)
	private Staff  staff; 
	
	
	private int specialiseId;
	
	
	@ManyToOne
	@JoinColumn(name="specialiseId", insertable = false, updatable = false)
	private Specialization  specialization; 
	
	
	private double consultationfee;
	
	
	
	private String isActive;
	
	
	@CreationTimestamp
	@Column(name = "created_date")
	private Date createdDate;


	public Doctor() {
		super();
	}


	public Doctor(int docId, int staffId, Staff staff, int specialiseId, Specialization specialization,
			double consultationfee, String isActive, Date createdDate) {
		super();
		this.docId = docId;
		this.staffId = staffId;
		this.staff = staff;
		this.specialiseId = specialiseId;
		this.specialization = specialization;
		this.consultationfee = consultationfee;
		this.isActive = isActive;
		this.createdDate = createdDate;
	}


	public int getDocId() {
		return docId;
	}


	public void setDocId(int docId) {
		this.docId = docId;
	}


	public int getStaffId() {
		return staffId;
	}


	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	@JsonBackReference
	public Staff getStaff() {
		return staff;
	}


	public void setStaff(Staff staff) {
		this.staff = staff;
	}


	public int getSpecialiseId() {
		return specialiseId;
	}


	public void setSpecialiseId(int specialiseId) {
		this.specialiseId = specialiseId;
	}

	@JsonBackReference
	public Specialization getSpecialization() {
		return specialization;
	}


	public void setSpecialization(Specialization specialization) {
		this.specialization = specialization;
	}


	public double getConsultationfee() {
		return consultationfee;
	}


	public void setConsultationfee(double consultationfee) {
		this.consultationfee = consultationfee;
	}


	public String getIsActive() {
		return isActive;
	}


	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}


	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	@Override
	public String toString() {
		return "Doctor [docId=" + docId + ", staffId=" + staffId + ", staff=" + staff + ", specialiseId=" + specialiseId
				+ ", specialization=" + specialization + ", consultationfee=" + consultationfee + ", isActive="
				+ isActive + ", createdDate=" + createdDate + "]";
	}
	
	
	
	

}
