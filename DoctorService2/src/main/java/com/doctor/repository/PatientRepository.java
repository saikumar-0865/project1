package com.doctor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doctor.entity.PatientDetails;

public interface PatientRepository extends JpaRepository<PatientDetails,   Integer> {

	List<PatientDetails> findByDoctorId(Integer doctorId);

}
