package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.entity.Staff;



public interface IStaffService {

	//List
	public List<Staff> getStaff();
				
	//Insert
	public void saveStaff(Staff staff);
				
	//update by id
	public Optional <Staff> getStaff(int id);
				
	//Delete
	public void deleteStaff(int id);
		
	//Find By staffName
	public List<Staff> getStaffsByStaffName(String name);
		
	
	//Find By phoneno
	public List<Staff> getStaffsByphoneno(String phoneno);
	//Get all Employee using viewModel -- inner join
	//public List<StaffDeptDTO> geAllDTOStaffs();
}
