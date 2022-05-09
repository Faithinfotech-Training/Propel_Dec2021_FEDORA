package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "labtest")
public class LabTest {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "test_id")
	 private int test_id;
	 
	 @Column(name = "test_code",nullable = false,unique = true)
	 
	 private String test_code;
	 
	 @Column(name = "test_name",nullable = false,length=30)
	 private String test_name;
	 
	 @Column(name = "low_range",nullable = false)
	 private double low_range;
	 
	 @Column(name = "high_range",nullable = false)
	 private double high_range;
	 
	 @Column(name = "unit",nullable = false)
	 private String unit;
	 
	 @Column(name = "price",nullable = false)
	 private double price;
	 
	
	 private int user_id;
	 
	 @Column(name = "is_active")
	 private boolean is_active;
	 
	 
	 @ManyToOne
	 @JoinColumn(name = "user_id" , insertable = false, updatable = false)
	 private Users users;


	 //default constructor
	public LabTest() {
		super();
	}


	public LabTest(int test_id, String test_code, String test_name, double low_range, double high_range, String unit,
			double price, int user_id, boolean is_active, Users users) {
		super();
		this.test_id = test_id;
		this.test_code = test_code;
		this.test_name = test_name;
		this.low_range = low_range;
		this.high_range = high_range;
		this.unit = unit;
		this.price = price;
		this.user_id = user_id;
		this.is_active = is_active;
		this.users = users;
	}


	public int getTest_id() {
		return test_id;
	}


	public void setTest_id(int test_id) {
		this.test_id = test_id;
	}


	public String getTest_code() {
		return test_code;
	}


	public void setTest_code(String test_code) {
		this.test_code = test_code;
	}


	public String getTest_name() {
		return test_name;
	}


	public void setTest_name(String test_name) {
		this.test_name = test_name;
	}


	public double getLow_range() {
		return low_range;
	}


	public void setLow_range(double low_range) {
		this.low_range = low_range;
	}


	public double getHigh_range() {
		return high_range;
	}


	public void setHigh_range(double high_range) {
		this.high_range = high_range;
	}


	public String getUnit() {
		return unit;
	}


	public void setUnit(String unit) {
		this.unit = unit;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public boolean isIs_active() {
		return is_active;
	}


	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}

	@JsonBackReference
	public Users getUsers() {
		return users;
	}


	public void setUsers(Users users) {
		this.users = users;
	}


	@Override
	public String toString() {
		return "LabTest [test_id=" + test_id + ", test_code=" + test_code + ", test_name=" + test_name + ", low_range="
				+ low_range + ", high_range=" + high_range + ", unit=" + unit + ", price=" + price + ", user_id="
				+ user_id + ", is_active=" + is_active + ", users=" + users + "]";
	}

    
	
	 
	
	 

}

