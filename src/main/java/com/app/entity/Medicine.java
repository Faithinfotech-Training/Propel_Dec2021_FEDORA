package com.app.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name= "medicine")
public class Medicine {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int medicineId;
	
	
	private String medicineName;
	
	
	private String genericName;
	
	
	private String companyName;
	
	
	private int quantity;
	
	private double price;
	
	
	private String isActive;
	
	@OneToMany(mappedBy="medicine",cascade=CascadeType.ALL)
	List<MedicinePrescribed> medicinePrescribed;
	
	
	@CreationTimestamp
	@Column(name = "created_date")
	private Date createdDate;


	public Medicine() {
		super();
	}


	public Medicine(int medicineId, String medicineName, String genericName, String companyName, int quantity,
			double price, String isActive, Date createdDate) {
		super();
		this.medicineId = medicineId;
		this.medicineName = medicineName;
		this.genericName = genericName;
		this.companyName = companyName;
		this.quantity = quantity;
		this.price = price;
		this.isActive = isActive;
		this.createdDate = createdDate;
	}


	public int getMedicineId() {
		return medicineId;
	}


	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}


	public String getMedicineName() {
		return medicineName;
	}


	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}


	public String getGenericName() {
		return genericName;
	}


	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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


	public String getIsActive() {
		return isActive;
	}


	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}


	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	@Override
	public String toString() {
		return "Medicine [medicineId=" + medicineId + ", medicineName=" + medicineName + ", genericName=" + genericName
				+ ", companyName=" + companyName + ", quantity=" + quantity + ", price=" + price + ", isActive="
				+ isActive + ", createdDate=" + createdDate + "]";
	}

	

}