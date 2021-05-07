package com.kamenko.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kamenko.domain.Appointment;

public interface AppointmentDao extends CrudRepository<Appointment, Long> {

    List<Appointment> findAll();

}
