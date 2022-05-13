package com.app.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
	@Table(name= "appointment")
	public class Appointment {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int appoinId;
		
		
		private int patientId;
		
		
		@ManyToOne
		@JoinColumn(name="patientId", insertable = false, updatable = false)
		private Patient  patient; 
		
		private String fullName;
		
		private String tokenNum;
		
		private int docId;
		
		@ManyToOne
		@JoinColumn(name="docId", insertable = false, updatable = false)
		private Doctor  doctor; 
		
		private Date doa;
		
		
		private String isActive;
		
		
		@CreationTimestamp
		@Column(name = "created_date")
		private Date createdDate;

		@OneToMany(mappedBy="appointment",cascade=CascadeType.ALL)
		List<LabTestPrescribed> labTestsPrescribed;
		
		
		@OneToMany(mappedBy="appointment",cascade=CascadeType.ALL)
		List<MedicinePrescribed> medicinePrescribed;
		
		@OneToMany(mappedBy="appointment",cascade=CascadeType.ALL)
		List<Prescriptionnotes> prescriptionnotes;

		public Appointment() {
			super();
		}


		public Appointment(int appoinId, int patientId, Patient patient,String fullName, String tokenNum, int docId, Doctor doctor,
				Date doa, String isActive, Date createdDate) {
			super();
			this.appoinId = appoinId;
			this.patientId = patientId;
			this.patient = patient;
			this.fullName=fullName;
			this.tokenNum = tokenNum;
			this.docId = docId;
			this.doctor = doctor;
			this.doa = doa;
			this.isActive = isActive;
			this.createdDate = createdDate;
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

		@JsonBackReference
		public Patient getPatient() {
			return patient;
		}


		public void setPatient(Patient patient) {
			this.patient = patient;
		}
		


		public String getPatient_name() {
			return fullName;
		}


		public void setPatient_name(String fullName) {
			this.fullName = fullName;
		}


		public String getTokenNum() {
			return tokenNum;
		}


		public void setTokenNum(String tokenNum) {
			this.tokenNum = tokenNum;
		}


		public int getDocId() {
			return docId;
		}


		public void setDocId(int docId) {
			this.docId = docId;
		}

		@JsonBackReference
		public Doctor getDoctor() {
			return doctor;
		}


		public void setDoctor(Doctor doctor) {
			this.doctor = doctor;
		}


		public Date getDoa() {
			return doa;
		}


		public void setDoa(Date doa) {
			this.doa = doa;
		}


		public String getIsActive() {
			return isActive;
		}


		public void setIsActive(String isActive) {

			this.isActive = "y";

			//this.isActive = isActive;

		}


		public Date getCreatedDate() {
			return createdDate;
		}


		public void setCreatedDate(Date createdDate) {
			this.createdDate = createdDate;
		}


		@Override
		public String toString() {
			return "Appointment [appoinId=" + appoinId + ", patientId=" + patientId + ", patient=" + patient
					+ ", fullName=" + fullName + ", tokenNum=" + tokenNum + ", docId=" + docId + ", doctor=" + doctor
					+ ", doa=" + doa + ", isActive=" + isActive + ", createdDate=" + createdDate
					+ ", labTestsPrescribed=" + labTestsPrescribed + ", medicinePrescribed=" + medicinePrescribed
					+ ", prescriptionnotes=" + prescriptionnotes + "]";
		}

}