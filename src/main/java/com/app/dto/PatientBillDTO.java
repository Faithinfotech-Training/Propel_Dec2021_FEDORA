package com.app.dto;

import java.time.LocalDateTime;
import java.util.Date;

public class PatientBillDTO {
	
	private int appointment_id;
	private int patient_id;
	private String patient_reg_no;
	private String patient_name;
	
	
	
	
	public PatientBillDTO() {
		super();
		// TODO Auto-generated constructor stub
	}




	public PatientBillDTO(int appointment_id, int patient_id, String patient_reg_no, String patient_name) {
		super();
		this.appointment_id = appointment_id;
		this.patient_id = patient_id;
		this.patient_reg_no = patient_reg_no;
		this.patient_name = patient_name;
	}




	public int getAppointment_id() {
		return appointment_id;
	}




	public void setAppointment_id(int appointment_id) {
		this.appointment_id = appointment_id;
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




	@Override
	public String toString() {
		return "PatientAppointmentDTO [appointment_id=" + appointment_id + ", patient_id=" + patient_id
				+ ", patient_reg_no=" + patient_reg_no + ", patient_name=" + patient_name + "]";
	}

	
	
	
}