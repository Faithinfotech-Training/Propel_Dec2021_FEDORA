package com.app.dao;



import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.entity.Staff;

@Repository
public interface IStaffRepository extends CrudRepository<Staff, Integer> {

	//custome method by using jpql
	@Modifying
	@Transactional
	@Query("UPDATE Staff SET isActive='n' WHERE staffId=?1")
	public void disableByid(Integer id);
	
	@Query("FROM Staff WHERE staffName LIKE %?1%")
	public List<Staff> findByName(String name);
		
	@Query("FROM Staff WHERE phoneNo LIKE %?1%")
	public List<Staff> findByphoneno(String phoneno);
}


