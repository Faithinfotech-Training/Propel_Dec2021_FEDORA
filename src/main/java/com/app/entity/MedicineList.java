package com.app.entity;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name=" medcine_list")
public class MedicineList {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name= "medicine_id  ")
	private int medicineid;
	
	@Column(name= "medicine_code", nullable = false, length=60)
	private String medicinecode;
	
	@Column(name= "medicine_name ", nullable = false, length=60)
	private String medicinename;
	
	@Column(name= "genericname", nullable = false, length=60)
	private String genericname;
	
	@Column(name= "company_name  ", nullable = false, length=60) 
	private String companyname;
	
	@Column(name= "quantity", nullable = false, length=60) 
	private int quantity;
	
	@Column(name= "price", nullable = false, length=60)
	private double price;
	
	@Column(name= "is_active ", nullable = false, length=60)
	private String  isactive;
	
	@Column(name= "created_on ", nullable = false, length=60)
	private LocalTime created_on ;
	
	
	public MedicineList() {
		super();
	}


	 

	public MedicineList(int medicineid, String medicinecode, String medicinename, String genericname, String companyname,
			int quantity, double price, String isactive, LocalTime created_on) {
		super();
		this.medicineid = medicineid;
		this.medicinecode = medicinecode;
		this.medicinename = medicinename;
		this.genericname = genericname;
		this.companyname = companyname;
		this.quantity = quantity;
		this.price = price;
		this.isactive = isactive;
		this.created_on = created_on;
	}




	public int getMedicineid() {
		return medicineid;
	}




	public void setMedicineid(int medicineid) {
		this.medicineid = medicineid;
	}




	public String getMedicinecode() {
		return medicinecode;
	}




	public void setMedicinecode(String medicinecode) {
		this.medicinecode = medicinecode;
	}




	public String getMedicinename() {
		return medicinename;
	}




	public void setMedicinename(String medicinename) {
		this.medicinename = medicinename;
	}




	public String getGenericname() {
		return genericname;
	}




	public void setGenericname(String genericname) {
		this.genericname = genericname;
	}




	public String getCompanyname() {
		return companyname;
	}




	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}




	public int getQuantity() {
		return quantity;
	}




	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}




	public double getPrice() {
		return price;
	}




	public void setPrice(double price) {
		this.price = price;
	}




	public String getIsactive() {
		return isactive;
	}




	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}




	public LocalTime getCreated_on() {
		return created_on;
	}




	public void setCreated_on(LocalTime created_on) {
		this.created_on = created_on;
	}




	@Override
	public String toString() {
		return "Pharmacist [medicineid=" + medicineid + ", medicinecode=" + medicinecode + ", medicinename="
				+ medicinename + ", genericname=" + genericname + ", companyname=" + companyname + ", quantity="
				+ quantity + ", price=" + price + ", isactive=" + isactive + ", created_on=" + created_on + "]";
	}




 
	
	
	
	
	
}
