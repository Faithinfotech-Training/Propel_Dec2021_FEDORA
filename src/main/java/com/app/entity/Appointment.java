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
	 
	 private int dept_id;
	 @ManyToOne
	 @JoinColumn(name = "dept_id" , insertable = false, updatable = false)
	 private Department department;
	 
	 private int doc_id;
	 @ManyToOne
	 @JoinColumn(name = "doc_id" , insertable = false, updatable = false)
	 private Doctor doctor;
	 
	 private String token_no;
	 
	 /*@ManyToOne
	 @JoinColumn(name = "token_no" )
	 private Token token;
	 */
	 
	 private Date appointment_date;
	 
	 private String is_active;
	 
	 private int staff_id;
	 @ManyToOne
	 @JoinColumn(name = "staff_id" , insertable = false, updatable = false)
	 private Staff staff;
	 
	 private LocalDateTime created_on;
	 
	 @OneToMany(mappedBy="appointment",cascade=CascadeType.ALL)
	 private List<ConsultationBill> consultation_bill;
	 
	
	 
	public Appointment() {
		super();
		
	}


	public Appointment(int appointment_id, int patient_id, Patient patient, int doc_id, Doctor doctor, String token_no,
			Date appointment_date, String is_active, int staff_id, Staff staff, LocalDateTime created_on,
			List<ConsultationBill> consultation_bill) {
		super();
		this.appointment_id = appointment_id;
		this.patient_id = patient_id;
		this.patient = patient;
		this.doc_id = doc_id;
		this.doctor = doctor;
		this.token_no = token_no;
		this.appointment_date = appointment_date;
		this.is_active = is_active;
		this.staff_id = staff_id;
		this.staff = staff;
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

	@JsonBackReference
	public int getDept_id() {
		return dept_id;
	}


	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}

	@JsonBackReference
	public int getDoc_id() {
		return doc_id;
	}


	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}


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


	public Date getAppointment_date() {
		return appointment_date;
	}


	public void setAppointment_date(Date appointment_date) {
		this.appointment_date = appointment_date;
	}


	public String getIs_active() {
		return is_active;
	}


	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}


	public int getStaff_id() {
		return staff_id;
	}


	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}


	public Staff getStaff() {
		return staff;
	}


	public void setStaff(Staff staff) {
		this.staff = staff;
	}


	public LocalDateTime getCreated_on() {
		return created_on;
	}


	public void setCreated_on(LocalDateTime created_on) {
		this.created_on = created_on;
	}


	public List<ConsultationBill> getConsultation_bill() {
		return consultation_bill;
	}


	public void setConsultation_bill(List<ConsultationBill> consultation_bill) {
		this.consultation_bill = consultation_bill;
	}


	@Override
	public String toString() {
		return "Appointment [appointment_id=" + appointment_id + ", patient_id=" + patient_id + ", patient=" + patient
				+ ", dept_id=" + dept_id + ", department=" + department + ", doc_id=" + doc_id + ", doctor=" + doctor
				+ ", token_no=" + token_no + ", appointment_date=" + appointment_date + ", is_active=" + is_active
				+ ", staff_id=" + staff_id + ", staff=" + staff + ", created_on=" + created_on + ", consultation_bill="
				+ consultation_bill + "]";
	}

	
	
	

	
}
