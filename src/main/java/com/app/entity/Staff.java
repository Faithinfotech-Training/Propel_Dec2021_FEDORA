package com.app.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Staff {

	//instance variable
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable=false,length=6)
	private Integer staff_id;
	
	@OneToOne
	@JoinColumn(name = "user_id",insertable=false,updatable=false)
	private Users user;
	
	
	private Integer user_id;
	
	
	@ManyToOne
	@JoinColumn(name = "dept_id",insertable=false,updatable=false)
	private Department department;
	
	
	private Integer dept_id;
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable=false,length=25)
	private String staff_no;
	
	
	@Column(nullable=false,length=40)
	private String staff_name;
	
	
	@Column(nullable=false,length=4)
	private String gender;
	
	
	@Column(nullable=false)
	private Date dob;
	
	
	@Column(nullable=false,length=30)
	private String experience;
	
	
	@Column(nullable=false,length=10)
	private String phone_no;
	
	@Column(nullable=false,length=100)
	private String email_id;
	
	
	@Column(nullable=false,length=200)
	private String address;
	
	
	@Column(nullable=false)
	private Date doj;
	
	
	@Column(nullable=false,length=30)
	private double salary;
	
	
	@Column(nullable=false)
	private boolean is_active;


	private LocalDate created_on;
	
	//default constructor
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}



	//parametrized constructor
	public Staff(Integer staff_id, Users user, Integer user_id, Department department, Integer dept_id, String staff_no,
			String staff_name, String gender, Date dob, String experience, String phone_no, String email_id,
			String address, Date doj, double salary, boolean is_active) {
		super();
		this.staff_id = staff_id;
		this.user = user;
		this.user_id = user_id;
		this.department = department;
		this.dept_id = dept_id;
		this.staff_no = staff_no;
		this.staff_name = staff_name;
		this.gender = gender;
		this.dob = dob;
		this.experience = experience;
		this.phone_no = phone_no;
		this.email_id = email_id;
		this.address = address;
		this.doj = doj;
		this.salary = salary;
		this.is_active = is_active;
	}


	
	//getter and setter
	public Integer getStaff_id() {
		return staff_id;
	}



	public void setStaff_id(Integer staff_id) {
		this.staff_id = staff_id;
	}



	public Users getUser() {
		return user;
	}



	public void setUser(Users user) {
		this.user = user;
	}



	public Integer getUser_id() {
		return user_id;
	}



	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}



	public Department getDepartment() {
		return department;
	}



	public void setDepartment(Department department) {
		this.department = department;
	}



	public Integer getDept_id() {
		return dept_id;
	}



	public void setDept_id(Integer dept_id) {
		this.dept_id = dept_id;
	}



	public String getStaff_no() {
		return staff_no;
	}



	public void setStaff_no(String staff_no) {
		this.staff_no = staff_no;
	}



	public String getStaff_name() {
		return staff_name;
	}



	public void setStaff_name(String staff_name) {
		this.staff_name = staff_name;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public Date getDob() {
		return dob;
	}



	public void setDob(Date dob) {
		this.dob = dob;
	}



	public String getExperience() {
		return experience;
	}



	public void setExperience(String experience) {
		this.experience = experience;
	}



	public String getPhone_no() {
		return phone_no;
	}



	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}



	public String getEmail_id() {
		return email_id;
	}



	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public Date getDoj() {
		return doj;
	}



	public void setDoj(Date doj) {
		this.doj = doj;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public boolean isIs_active() {
		return is_active;
	}



	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}



	@Override
	public String toString() {
		return "Staff [staff_id=" + staff_id + ", user=" + user + ", user_id=" + user_id + ", department=" + department
				+ ", dept_id=" + dept_id + ", staff_no=" + staff_no + ", staff_name=" + staff_name + ", gender="
				+ gender + ", dob=" + dob + ", experience=" + experience + ", phone_no=" + phone_no + ", email_id="
				+ email_id + ", address=" + address + ", doj=" + doj + ", salary=" + salary + ", is_active=" + is_active
				+ "]";
	}

		
	
}
