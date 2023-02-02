package com.doctor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doctor.entity.Comments;

public interface CommentsRepository extends JpaRepository<Comments, Integer>{

}
