package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.app.entity.Specialization;


public interface ISpecializationRepository extends CrudRepository<Specialization, Integer> {
	
	
}
