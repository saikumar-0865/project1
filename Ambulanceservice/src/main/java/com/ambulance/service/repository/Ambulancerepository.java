package com.ambulance.service.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ambulance.service.entity.Ambulance;

@Repository
public interface Ambulancerepository extends JpaRepository<Ambulance, Long> {

	List<Ambulance> findByStatus(String status);

	Ambulance findByLocation(String location);
	
	
 
	
	
	
}
