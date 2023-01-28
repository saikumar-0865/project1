package com.ambulance.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ambulance.service.entity.Ambulance;
import com.ambulance.service.entity.Patient;
import com.ambulance.service.service.AmbulanceService;
import com.ambulance.service.service.PatientService;

@RestController
public class Ambulancecontroller {   
	
	
	@Autowired
	private AmbulanceService ambulanceService;
	
	@Autowired
	private PatientService patientService;
	
	
	
	@GetMapping("/ambulance/status/{status}")
	public ResponseEntity<List<Ambulance>> getAmbulanceByStatus(@PathVariable String status){
		
		
		List<Ambulance> ambulances = ambulanceService.getAmbulanceByStatus(status);
		return new ResponseEntity<List<Ambulance>>(ambulances,HttpStatus.OK);
	}
	
	
	
	@GetMapping("/ambulance/location/{location}")
	public ResponseEntity<Ambulance> getAmbulanceByLocation(@PathVariable String location){
		
		Ambulance ambulance = ambulanceService.getAmbulanceByLocation(location);
		return new ResponseEntity<>(ambulance, HttpStatus.OK);
		
		
	}
	
	
	
	
	
	
	

}
