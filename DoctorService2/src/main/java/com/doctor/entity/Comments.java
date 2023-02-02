package com.doctor.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Comments {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int commentId;
	private String comments;
	
	@ManyToOne()
	@JoinColumn(name = "patientId")
	private PatientDetails patient;
	
	@OneToOne(targetEntity = NurseDetails.class)
	private NurseDetails nurseId;
	
	
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public PatientDetails getPatient() {
		return patient;
	}
	public void setPatient(PatientDetails patient) {
		this.patient = patient;
	}
	public NurseDetails getNurseId() {
		return nurseId;
	}
	public void setNurseId(NurseDetails nurseId) {
		this.nurseId = nurseId;
	}
	public Comments(int commentId, String comments, PatientDetails patient, NurseDetails nurseId) {
		super();
		this.commentId = commentId;
		this.comments = comments;
		this.patient = patient;
		this.nurseId = nurseId;
	}
	public Comments() {
		super();
	}
	public Comments(String comments, PatientDetails patient) {
		super();
		this.comments = comments;
		this.patient = patient;
	}
	
	

	/*public int getCommentId() {
	
	}

	public Comments(int commentId, String comments, NurseDetails nurseId) {
		super();
		this.commentId = commentId;
		this.comments = comments;
		this.nurseId = nurseId;
	}

	public Comments() {
		super();
	}

	public Comments(String comments, NurseDetails nurseId) {
		super();
		this.comments = comments;
		this.nurseId = nurseId;
	}*/
	
	
	

}
