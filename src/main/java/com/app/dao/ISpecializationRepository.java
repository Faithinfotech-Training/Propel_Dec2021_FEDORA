package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Specialization;

@Repository
public interface ISpecializationRepository extends CrudRepository<Specialization, Integer> {
	
	
}
