package com.doctor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctor.entity.Comments;
import com.doctor.repository.CommentsRepository;

@Service
public class CommentsServiceImpl implements CommentsService {
	
	@Autowired
	private CommentsRepository commentsRepository;

	@Override
	public Comments saveComment(Comments comments) {
		return commentsRepository.save(comments);
	}

	/*
	 * @Override public Comments saveComment(Comments comments) { return
	 * commentsRepository.save(comments); }
	 * 
	 * @Override public Comments createComments(Comments comments) { return
	 * commentsRepository.save(comments); }
	 */
	/*@Override
	public List<Comments> getCommentsByPatientId(Long patientId) {
		return commentsRepository.findByPatientId(patientId);
	}*/
	
	
	
	
	
	

}
