package com.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.app.entity.MedicinePrescribed;

public interface IMedicinePrescriptionRepository extends CrudRepository<MedicinePrescribed, Integer> {

}
