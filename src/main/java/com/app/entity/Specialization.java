package com.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name= "specialization")
public class Specialization {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int specialiseId;
	
	
	private String specialization;
	
	private String isActive;
	
	
	@CreationTimestamp
	@Column(name = "created_date")
	private Date createdDate;


	public Specialization() {
		super();
	}


	public Specialization(int specialiseId, String specialization, String isActive, Date createdDate) {
		super();
		this.specialiseId = specialiseId;
		this.specialization = specialization;
		this.isActive = isActive;
		this.createdDate = createdDate;
	}


	public int getSpecialiseId() {
		return specialiseId;
	}


	public void setSpecialiseId(int specialiseId) {
		this.specialiseId = specialiseId;
	}


	public String getSpecialization() {
		return specialization;
	}


	public void setSpecialization(String specialization) {
		this.specialization = specialization;
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
		return "Specialization [specialiseId=" + specialiseId + ", specialization=" + specialization + ", isActive="
				+ isActive + ", createdDate=" + createdDate + "]";
	}
	
	
	

}
