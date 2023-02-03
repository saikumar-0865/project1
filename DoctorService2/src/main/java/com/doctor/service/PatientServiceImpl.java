package com.doctor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctor.entity.DoctorDetails;
import com.doctor.entity.PatientDetails;
import com.doctor.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	private PatientRepository patientRepository;

	@Override
	public void updatePatientStatus(int id) {
		
		//return patientRepository.
		
		
		
		
		
		
	}

	@Override
	public List<PatientDetails> getPatients() {
		return   patientRepository.findAll() ;
	}

	@Override
	public List<PatientDetails> getAllPatientsByDoctorId(DoctorDetails docId) {
		
		
		return patientRepository.findByDoctorId(docId.getDoctorId());
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	


