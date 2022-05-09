package com.app.entity;

import java.time.LocalDate;
import java.util.List;

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
}
