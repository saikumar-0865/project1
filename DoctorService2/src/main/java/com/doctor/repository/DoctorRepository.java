package com.doctor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doctor.entity.DoctorDetails;

public interface DoctorRepository extends JpaRepository<DoctorDetails,    Integer> {

}
