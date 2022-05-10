package com.app.entity;


import java.time.LocalDate;
import java.time.LocalDateTime;
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

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.app.service.DatePrefixedSequenceIdGenerator;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "patient")
public class Patient {
	

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int patient_id;
	 
	 
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "patient_reg_no")
	 @GenericGenerator(
	        name = "patient_reg_no", 
	        strategy = "org.thoughts.on.java.generators.DatePrefixedSequenceIdGenerator", 
	        parameters = {@Parameter(name = DatePrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "50")})
	 private String patient_reg_no;
	 
	 
	 @Column(nullable = false)
	 private String patient_name;
	 
	 private Date dob;
	 
	 private String gender;
	 
	 private String blood_group;
	 
	 private String phone_no;
	
	 private String email;
	 
	 private String address;
	 
	 private String is_active;
	 
	 private int staff_id;
	 @ManyToOne
	 @JoinColumn(name = "staff_id" , insertable = false, updatable = false)
	 private Staff staff;
	 
	 private LocalDateTime created_on;
	 
	 @OneToMany(mappedBy="patient",cascade=CascadeType.ALL)
	 private List<Appointment> appointment;
	 
	//default constructor
	public Patient() {
		super();
			
	}

		
	

	public Patient(int patient_id, String patient_reg_no, String patient_name, Date dob, String gender,
			String blood_group, String phone_no, String email, String address, String is_active, int staff_id,
			Staff staff, LocalDateTime created_on, List<Appointment> appointment) {
		super();
		this.patient_id = patient_id;
		this.patient_reg_no = patient_reg_no;
		this.patient_name = patient_name;
		this.dob = dob;
		this.gender = gender;
		this.blood_group = blood_group;
		this.phone_no = phone_no;
		this.email = email;
		this.address = address;
		this.is_active = is_active;
		this.staff_id = staff_id;
		this.staff = staff;
		this.created_on = created_on;
		this.appointment = appointment;
	}


	public int getPatient_id() {
		return patient_id;
	}


	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}


	public String getPatient_reg_no() {
		return patient_reg_no;
	}


	public void setPatient_reg_no(String patient_reg_no) {
		this.patient_reg_no = patient_reg_no;
	}


	public String getPatient_name() {
		return patient_name;
	}


	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getBlood_group() {
		return blood_group;
	}


	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}


	public String getPhone_no() {
		return phone_no;
	}


	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getIs_active() {
		return is_active;
	}


	public void setIs_active(String is_active) {
		this.is_active = "y";
	}

	@JsonBackReference
	public int getStaff_id() {
		return staff_id;
	}


	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}

	@JsonBackReference
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


	public List<Appointment> getAppointment() {
		return appointment;
	}


	public void setAppointment(List<Appointment> appointment) {
		this.appointment = appointment;
	}


	@Override
	public String toString() {
		return "Patient [patient_id=" + patient_id + ", patient_reg_no=" + patient_reg_no + ", patient_name="
				+ patient_name + ", dob=" + dob + ", gender=" + gender + ", blood_group=" + blood_group + ", phone_no="
				+ phone_no + ", email=" + email + ", address=" + address + ", is_active=" + is_active + ", staff_id="
				+ staff_id + ", staff=" + staff + ", created_on=" + created_on + ", appointment=" + appointment + "]";
	}
	
	




	 
}
