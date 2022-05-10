package com.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IAppointmentRepository;
import com.app.dto.PatientAppointmentDTO;
import com.app.dto.PatientBillDTO;
import com.app.entity.Appointment;


@Service
public class AppointmentImplementation implements IAppointmentService {
	
	@Autowired
	private IAppointmentRepository appointmentRepo;

	@Override
	public List<Appointment> getAppointment() {
		return (List<Appointment>) appointmentRepo.findAll();
	}

	@Override
	public void saveAppointment(Appointment appointment) {
		appointmentRepo.save(appointment);
	}

	@Override
	public Optional<Appointment> getAppointment(int id) {
		return appointmentRepo.findById(id);
	}

	@Override
	public void disableAppointment(int id) {
		appointmentRepo.deleteById(id);  
	}

	@Override
	public List<PatientAppointmentDTO> findAllDTOAppoinment() {
		//return (List<PatientAppointmentDTO>) appointmentRepo.findAllDTOAppoinment();  
	
		List<PatientAppointmentDTO> appointmentList = appointmentRepo.findAllDTOAppoinment(); 
		List<PatientAppointmentDTO> appointmentDtolist = new ArrayList<>();
		for (PatientAppointmentDTO appointment : appointmentList) {
			PatientAppointmentDTO dto = new PatientAppointmentDTO();
			
			dto.setAppointment_id(appointment.getAppointment_id());
			dto.setPatient_id(appointment.getPatient_id());
			dto.setPatient_reg_no(appointment.getPatient_reg_no());
			dto.setPatient_reg_no(appointment.getPatient_reg_no());
			dto.setPatient_name(appointment.getPatient_name());
			//dto.setStaff_name(appointment.getStaff_name());
			 
			appointmentDtolist.add(dto);
		}
		return appointmentDtolist;	
		
	}

	@Override
	public List<PatientBillDTO> findAllDTOBill() {
		//return (List<PatientBillDTO>)  appointmentRepo.findAllDTOBill();
		List<PatientBillDTO> billList = appointmentRepo.findAllDTOBill(); 
		List<PatientBillDTO> billDtolist = new ArrayList<>();
		for (PatientBillDTO bill : billList) {
			PatientBillDTO bdto = new PatientBillDTO();
			
			bdto.setAppointment_id(bill.getAppointment_id());
			bdto.setPatient_id(bill.getPatient_id());
			bdto.setPatient_reg_no(bill.getPatient_reg_no());
			bdto.setPatient_name(bill.getPatient_name());
			//bdto.setConsultancy_fee(bill.getConsultancy_fee());
			//bdto.setAppointment_date(bill.getAppointment_date());
			
			billDtolist.add(bdto);
		}
		return billDtolist;	

	}
}
