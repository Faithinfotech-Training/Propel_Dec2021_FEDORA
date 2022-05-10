package com.app.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "appointment")
public class Appointment {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int appointment_id;
	 
	 private int patient_id;
	 @ManyToOne
	 @JoinColumn(name = "patient_id" , insertable = false, updatable = false)
	 private Patient patient;
	 
	 private int doc_id;
	 @ManyToOne
	 @JoinColumn(name = "doc_id" , insertable = false, updatable = false)
	 private Doctor doctor;
	 
	 private String token_no;
	 
	 
	 private LocalDate appointment_date;
	 
	 private boolean is_active;
	 
	 private int user_id;
	 @ManyToOne
	 @JoinColumn(name = "user_id" , insertable = false, updatable = false)
	 private Users user;
	 
	 private LocalDateTime created_on;
	 
	 @OneToMany(mappedBy="appointment",cascade=CascadeType.ALL)
	 private List<ConsultationBill> consultation_bill;
	 
	public Appointment() {
		super();
		
	}

	public Appointment(int appointment_id, int patient_id, Patient patient, int doc_id, Doctor doctor, String token_no,
			 LocalDate appointment_date, boolean is_active, int user_id, Users user,
			LocalDateTime created_on, List<ConsultationBill> consultation_bill) {
		super();
		this.appointment_id = appointment_id;
		this.patient_id = patient_id;
		this.patient = patient;
		this.doc_id = doc_id;
		this.doctor = doctor;
		this.token_no = token_no;
		
		this.appointment_date = appointment_date;
		this.is_active = is_active;
		this.user_id = user_id;
		this.user = user;
		this.created_on = created_on;
		this.consultation_bill = consultation_bill;
	}

	public int getAppointment_id() {
		return appointment_id;
	}

	public void setAppointment_id(int appointment_id) {
		this.appointment_id = appointment_id;
	}

	public int getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	@JsonBackReference
	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public int getDoc_id() {
		return doc_id;
	}

	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}
	@JsonBackReference
	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public String getToken_no() {
		return token_no;
	}

	public void setToken_no(String token_no) {
		this.token_no = token_no;
	}

	
	public LocalDate getAppointment_date() {
		return appointment_date;
	}

	public void setAppointment_date(LocalDate appointment_date) {
		this.appointment_date = appointment_date;
	}

	public boolean isIs_active() {
		return is_active;
	}

	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	@JsonBackReference
	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public LocalDateTime getCreated_on() {
		return created_on;
	}

	public void setCreated_on(LocalDateTime created_on) {
		this.created_on = created_on;
	}
	@JsonBackReference
	public List<ConsultationBill> getConsultation_bill() {
		return consultation_bill;
	}

	public void setConsultation_bill(List<ConsultationBill> consultation_bill) {
		this.consultation_bill = consultation_bill;
	}

	@Override
	public String toString() {
		return "Appointment [appointment_id=" + appointment_id + ", patient_id=" + patient_id + ", patient=" + patient
				+ ", doc_id=" + doc_id + ", doctor=" + doctor + ", token_no=" + token_no +  ", appointment_date=" + appointment_date + ", is_active=" + is_active + ", user_id=" + user_id
				+ ", user=" + user + ", created_on=" + created_on + ", consultation_bill=" + consultation_bill + "]";
	}

	

	
}
