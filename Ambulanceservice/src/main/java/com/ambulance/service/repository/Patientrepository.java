package com.ambulance.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ambulance.service.entity.Patient;

@Repository
public interface Patientrepository extends JpaRepository<Patient, Long> {

}
