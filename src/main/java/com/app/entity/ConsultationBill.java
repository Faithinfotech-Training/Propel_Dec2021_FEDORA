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
@Table(name = "consultation_bill")
public class ConsultationBill {


	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int consultancy_bill_id;
	 
	 private int appointment_id;
	 @ManyToOne
	 @JoinColumn(name = "appointment_id" , insertable = false, updatable = false)
	 private Appointment appointment;
	 
	 private double consultancy_fee;
	 @ManyToOne
	 @JoinColumn(name = "consultancy_fee" , insertable = false, updatable = false)
	 private Doctor doctor;
	 
	 private LocalDate consultancy_date;
	 
	 private int staff_id;
	 @ManyToOne
	 @JoinColumn(name = "staff_id" , insertable = false, updatable = false)
	 private Staff staff;
	
	 private LocalDateTime created_on;
	 
	

	public ConsultationBill() {
		super();
	}

	public ConsultationBill(int consultancy_bill_id, int appointment_id, Appointment appointment,
			double consultancy_fee, Doctor doctor, LocalDate consultancy_date, int staff_id, Staff staff,
			LocalDateTime created_on) {
		super();
		this.consultancy_bill_id = consultancy_bill_id;
		this.appointment_id = appointment_id;
		this.appointment = appointment;
		this.consultancy_fee = consultancy_fee;
		this.doctor = doctor;
		this.consultancy_date = consultancy_date;
		this.staff_id = staff_id;
		this.staff = staff;
		this.created_on = created_on;
	}

	public int getConsultancy_bill_id() {
		return consultancy_bill_id;
	}

	public void setConsultancy_bill_id(int consultancy_bill_id) {
		this.consultancy_bill_id = consultancy_bill_id;
	}

	@JsonBackReference
	public int getAppointment_id() {
		return appointment_id;
	}

	public void setAppointment_id(int appointment_id) {
		this.appointment_id = appointment_id;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	public double getConsultancy_fee() {
		return consultancy_fee;
	}

	public void setConsultancy_fee(double consultancy_fee) {
		this.consultancy_fee = consultancy_fee;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public LocalDate getConsultancy_date() {
		return consultancy_date;
	}

	public void setConsultancy_date(LocalDate consultancy_date) {
		this.consultancy_date = consultancy_date;
	}

	@JsonBackReference
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

	@Override
	public String toString() {
		return "ConsultationBill [consultancy_bill_id=" + consultancy_bill_id + ", appointment_id=" + appointment_id
				+ ", appointment=" + appointment + ", consultancy_fee=" + consultancy_fee + ", doctor=" + doctor
				+ ", consultancy_date=" + consultancy_date + ", staff_id=" + staff_id + ", staff=" + staff
				+ ", created_on=" + created_on + "]";
	}

	
}
