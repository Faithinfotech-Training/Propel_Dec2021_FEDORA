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
@Table(name = "users")
public class Users {
	 
	 //
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int user_id;
	 
	 @Column(nullable = false,unique = true)
	 private String user_name;
	 
	 @Column(nullable = false)
	 private String password;
	 
	 private boolean is_active;
	  
	 private Integer role_id;
	  
	 @ManyToOne
	 @JoinColumn(name = "role_id" , insertable = false, updatable = false)
	 private Roles roles;

	 
	public Users() {
		super();
		
	}

	//parameterized constructor
	/**
	 * @param user_id
	 * @param user_name
	 * @param password
	 * @param is_active
	 * @param role_id
	 * @param roles
	 */
	public Users(int user_id, String user_name, String password, boolean is_active, Integer role_id, Roles roles) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.password = password;
		this.is_active = is_active;
		this.role_id = role_id;
		this.roles = roles;
	}
	
	//getters and setters
	/**
	 * @return the user_id
	 */
	public int getUser_id() {
		return user_id;
	}

	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	/**
	 * @return the user_name
	 */
	public String getUser_name() {
		return user_name;
	}

	/**
	 * @param user_name the user_name to set
	 */
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the is_active
	 */
	public boolean isIs_active() {
		return is_active;
	}

	/**
	 * @param is_active the is_active to set
	 */
	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}

	/**
	 * @return the role_id
	 */
	@JsonBackReference
	public Integer getRole_id() {
		return role_id;
	}

	/**
	 * @param role_id the role_id to set
	 */
	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}

	/**
	 * @return the roles
	 */
	public Roles getRoles() {
		return roles;
	}

	/**
	 * @param roles the roles to set
	 */
	public void setRoles(Roles roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Users [user_id=" + user_id + ", user_name=" + user_name + ", password=" + password + ", is_active="
				+ is_active + ", role_id=" + role_id + ", roles=" + roles + "]";
	}
	
	

}
