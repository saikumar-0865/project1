package com.doctor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctor.entity.DoctorDetails;
import com.doctor.repository.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorService {
	
	
	@Autowired
	private DoctorRepository doctorRepository;

	
	

}
