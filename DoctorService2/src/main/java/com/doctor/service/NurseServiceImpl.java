package com.doctor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctor.repository.NurseRepository;

@Service
public class NurseServiceImpl implements NurseService {
	
	@Autowired
	private NurseRepository nurseRepository; 

}
