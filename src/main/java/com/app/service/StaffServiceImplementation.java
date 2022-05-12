package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IStaffRepository;
import com.app.entity.Staff;

@Service
public class StaffServiceImplementation implements IStaffService {

	
	//field injection
	@Autowired
	private IStaffRepository staffrepo;
	
	
	//list staff
	@Override
	public List<Staff> getStaff() {
		return (List<Staff>) staffrepo.findAll();
	}

	
	//insert staff
	@Override
	public void saveStaff(Staff staff) {
		staffrepo.save(staff);

	}

	
	//search staff by id
	@Override
	public Optional<Staff> getStaff(int id) {
		
		return staffrepo.findById(id);
	}

	
	
	//delete staff
	@Override
	public void deleteStaff(int id) {		
		staffrepo.disableByid(id);
	}


	@Override
	public List<Staff> getStaffsByStaffName(String name) {
		
		return staffrepo.findByName(name);
	}


	@Override
	public List<Staff> getStaffsByphoneno(String phoneno) {
		
		return staffrepo.findByphoneno(phoneno);
	}

}
