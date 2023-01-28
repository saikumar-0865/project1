package com.ambulance.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ambulance.service.repository.Patientrepository;

@Service
public class PatientServiceImpl implements PatientService {
	
	
	@Autowired
	private Patientrepository patientrepository;

}
