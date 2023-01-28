package com.ambulance.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ambulance.service.entity.Ambulance;
import com.ambulance.service.repository.Ambulancerepository;

@Service
public class AmbulanceImpl implements AmbulanceService {
	
	
	@Autowired
	private Ambulancerepository ambulancerepository;

	public List<Ambulance> getAmbulanceByStatus(String status) {
		return ambulancerepository.findByStatus(status);
	}

	@Override
	public Ambulance getAmbulanceByLocation(String location) {
		// TODO Auto-generated method stub
		return ambulancerepository.findByLocation(location);
	}

}
