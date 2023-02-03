package com.doctor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctor.entity.DoctorDetails;
import com.doctor.entity.NurseDetails;
import com.doctor.entity.PatientDetails;
import com.doctor.repository.DoctorRepository;
import com.doctor.repository.NurseRepository;
import com.doctor.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	private PatientRepository patientRepository;
	
	@Autowired
	private NurseRepository nurseRepository;
	
	@Autowired
	private DoctorRepository doctorRepository;

	@Override
	public boolean getPatientStatusById(int id) {
		
		
		PatientDetails patient = patientRepository.findById(id).get();
		return patient.isStatus();
	}

/*	@Override
	public void updatePatientStatus(int id) {
		
		PatientDetails patient = patientRepository.findById(patientId).get();
		patient.setStatus(true);
		patientRepository.save(patient);
		NurseDetails nurse = nurseRepository.findBynurseId(patient.getNurseId().getId()).get();
		nurse.setAvaliability(true);
		nurseRepository.save(nurse);
		DoctorDetails doctor=doctorRepository.findById(patient.getDoctorId().getDoctorId()).get();
		doctor.setAvaliability(true);
		doctorRepository.save(doctor);
		return patient;
		
	}*/

	/*
	 * @Override public void updatePatientStatus(int id) {
	 * 
	 * //return patientRepository.
	 * 
	 * 
	 * 
	 * }
	 * 
	 * @Override public List<PatientDetails> getPatients() { return
	 * patientRepository.findAll() ; }
	 * 
	 * @Override public List<PatientDetails> getAllPatientsByDoctorId(DoctorDetails
	 * docId) {
	 * 
	 * 
	 * return patientRepository.findByDoctorId(docId.getDoctorId()); }
	 * 
	 */

	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	


