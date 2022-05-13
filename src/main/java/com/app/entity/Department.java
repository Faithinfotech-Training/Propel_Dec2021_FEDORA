package com.app.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable=false,length=6)
	private Integer dept_id;
	
	
	private String dept_name;
	
	@OneToMany(mappedBy="department")
	private List<Staff> staff;
	
	
	@OneToMany(mappedBy="department")
	private List<Doctor> doctor;
	
	
	private LocalDate created_on;

	 @OneToMany(mappedBy="department",cascade=CascadeType.ALL)
	 private List<Appointment> appointment;
	 
	 
	public Department() {
		super();
		
	}


	public Department(Integer dept_id, String dept_name, List<Staff> staff, List<Doctor> doctor, LocalDate created_on) {
		super();
		this.dept_id = dept_id;
		this.dept_name = dept_name;
		this.staff = staff;
		this.doctor = doctor;
		this.created_on = created_on;
	}


	public Integer getDept_id() {
		return dept_id;
	}


	public void setDept_id(Integer dept_id) {
		this.dept_id = dept_id;
	}


	public String getDept_name() {
		return dept_name;
	}


	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}


	public List<Staff> getStaff() {
		return staff;
	}


	public void setStaff(List<Staff> staff) {
		this.staff = staff;
	}


	public List<Doctor> getDoctor() {
		return doctor;
	}


	public void setDoctor(List<Doctor> doctor) {
		this.doctor = doctor;
	}


	public LocalDate getCreated_on() {
		return created_on;
	}


	public void setCreated_on(LocalDate created_on) {
		this.created_on = created_on;
	}


	@Override
	public String toString() {
		return "Department [dept_id=" + dept_id + ", dept_name=" + dept_name + ", staff=" + staff + ", doctor=" + doctor
				+ ", created_on=" + created_on + "]";
	}
	
	
}
