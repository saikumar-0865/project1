package com.ambulance.service.service;

import java.util.List;

import com.ambulance.service.entity.Ambulance;

public interface AmbulanceService {

	List<Ambulance> getAmbulanceByStatus(String status);

	Ambulance getAmbulanceByLocation(String location);

}