package com.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.MedicinePrescribed;

@Repository
public interface IMedPrescibedRepo extends CrudRepository <MedicinePrescribed, Integer> {

}
