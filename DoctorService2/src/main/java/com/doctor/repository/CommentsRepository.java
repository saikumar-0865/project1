package com.doctor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doctor.entity.Comments;

public interface CommentsRepository extends JpaRepository<Comments, Integer>{

	List<Comments> findByPatientId(Long patientId);

}
