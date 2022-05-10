package com.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Appointment;

@Repository
public interface IAppointmentRepo extends CrudRepository<Appointment,Integer> {

}
