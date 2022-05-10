package com.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Roles {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int role_id;
	  private String role_name;
	  
	//default constructor  
	public Roles() {
		super();
		
	}
	
	//parameterized constructor
	/**
	 * @param role_id
	 * @param role_name
	 */
	public Roles(int role_id, String role_name) {
		super();
		this.role_id = role_id;
		this.role_name = role_name;
	}

	//getters and setters
	/**
	 * @return the role_id
	 */
	public int getRole_id() {
		return role_id;
	}

	/**
	 * @param role_id the role_id to set
	 */
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	/**
	 * @return the role_name
	 */
	public String getRole_name() {
		return role_name;
	}

	/**
	 * @param role_name the role_name to set
	 */
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	@Override
	public String toString() {
		return "Roles [role_id=" + role_id + ", role_name=" + role_name + "]";
	}

	
	  
	  

}
