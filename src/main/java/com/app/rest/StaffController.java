package com.app.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Staff;
import com.app.service.IStaffService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class StaffController {

	@Autowired
	private IStaffService staffservice;
	
	//Get all staff
		@GetMapping("/staffs")
		public List<Staff> getAllStaff() {
			return staffservice.getStaff();
			
		}
		
		//Get staff by id
		@GetMapping("/staffs/{id}")
		public Optional <Staff> getStaff(@PathVariable int id) {
			return staffservice.getStaff(id);
		}
		
		
		//Get staff by name
		@GetMapping("/staffs/name/{name}")
		public List<Staff> getStaffByName(@PathVariable String name) {
			return staffservice.getStaffsByStaffName(name);
		}
		
		
		//Get staff by phone no
		@GetMapping("/staffs/phoneno/{phoneno}")
		public List<Staff> getStaffByPhoneNo(@PathVariable String phoneno) {
			return staffservice.getStaffsByphoneno(phoneno);
		}
		
		//Add staff
		@PostMapping("/staffs")
		public void addStaff(@RequestBody Staff staff) {
			staffservice.saveStaff(staff);
	 
		}
		
		//update staff
		@PutMapping("/staffs")
		public void updateStaff(@RequestBody Staff staff) {
			staffservice.saveStaff(staff);

		}
		
		//Delete staff
		@PutMapping("/staffs/{id}")
		public void deleteEmployee(@PathVariable int id) {
			staffservice.deleteStaff(id);

		}
}
