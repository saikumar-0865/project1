package com.doctor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doctor.entity.NurseDetails;

public interface NurseRepository extends JpaRepository<NurseDetails , Integer> {

}
