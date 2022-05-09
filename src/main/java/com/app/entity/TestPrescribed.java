package com.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="test_prescription")
public class TestPrescribed {
	//instance variable
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int test_prescription_id;
	
	@OneToOne
	@JoinColumn(name="test_id",insertable = false, updatable = false)
	private LabTest labTest;
	
	private Integer con_id;
	@ManyToOne
	@JoinColumn(name="con_id",insertable = false, updatable = false)
	
	private Consultation consultation;

	
	public TestPrescribed() {
		super();
		// TODO Auto-generated constructor stub
	}


	public TestPrescribed(int test_prescription_id, LabTest labTest, Integer con_id, Consultation consultation) {
		super();
		this.test_prescription_id = test_prescription_id;
		this.labTest = labTest;
		this.con_id = con_id;
		this.consultation = consultation;
	}


	public int getTest_prescription_id() {
		return test_prescription_id;
	}


	public void setTest_prescription_id(int test_prescription_id) {
		this.test_prescription_id = test_prescription_id;
	}

	
	public LabTest getLabTest() {
		return labTest;
	}


	public void setLabTest(LabTest labTest) {
		this.labTest = labTest;
	}


	public Integer getCon_id() {
		return con_id;
	}


	public void setCon_id(Integer con_id) {
		this.con_id = con_id;
	}

	@JsonBackReference
	public Consultation getConsultation() {
		return consultation;
	}


	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}


	@Override
	public String toString() {
		return "TestPrescribed [test_prescription_id=" + test_prescription_id + ", labTest=" + labTest + ", con_id="
				+ con_id + ", consultation=" + consultation + "]";
	}


	
	
	
}
