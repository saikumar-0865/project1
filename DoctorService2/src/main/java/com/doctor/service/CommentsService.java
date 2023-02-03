package com.doctor.service;

import java.util.List;

import com.doctor.entity.Comments;

public interface CommentsService {

	Comments saveComment(Comments comments);

	Comments createComments(Comments comments);

	List<Comments> getCommentsByPatientId(Long patientId);

}