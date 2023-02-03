package com.doctor.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doctor.entity.NurseDetails;
import com.doctor.entity.PatientDetails;

public interface NurseRepository extends JpaRepository<NurseDetails , Integer> {

	Optional<PatientDetails> findBynurseId(int id);

}
