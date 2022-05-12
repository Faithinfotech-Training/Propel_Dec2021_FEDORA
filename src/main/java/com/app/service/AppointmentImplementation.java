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

//changes from Arjun
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
			
			dto.setAppoinId(appointment.getAppoinId());
			dto.setDoa(appointment.getDoa());
			dto.setPatientId(appointment.getPatientId());
			dto.setFullName(appointment.getFullName());
			dto.setGender(appointment.getGender());
			dto.setBloodGroup(appointment.getBloodGroup());
			dto.setTokenNum(appointment.getTokenNum());
			dto.setSpecialization(appointment.getSpecialization());
			dto.setDoctorName(appointment.getDoctorName());
			
			 
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
			
			
			bdto.setAppoinId(bill.getAppoinId());
			bdto.setPatientId(bill.getPatientId());
			bdto.setFullName(bill.getFullName());
			bdto.setDoctorName(bill.getDoctorName());
			bdto.setConsultationfee(bill.getConsultationfee());
			bdto.setSpecialization(bill.getSpecialization());
			bdto.setCreatedDate(bill.getCreatedDate());
			
		
			billDtolist.add(bdto);
		}
		return billDtolist;	

	}
}
