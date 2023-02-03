package com.doctor.service;

import java.util.List;

import com.doctor.entity.DoctorDetails;
import com.doctor.entity.PatientDetails;

public interface PatientService {

	boolean getPatientStatusById(int id);

	//void updatePatientStatus(int id);

	/*
	 * void updatePatientStatus(int id);
	 * 
	 * List<PatientDetails> getPatients();
	 * 
	 * List<PatientDetails> getAllPatientsByDoctorId(DoctorDetails docId);
	 */

}