package com.doctor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doctor.entity.Comments;
import com.doctor.entity.PatientDetails;

public interface CommentsRepository extends JpaRepository<Comments, Integer>{

//	List<Comments> findByPatientId(PatientDetails id);

}
