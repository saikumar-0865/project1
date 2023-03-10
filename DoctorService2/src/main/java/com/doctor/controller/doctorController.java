package com.doctor.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doctor.entity.Comments;
import com.doctor.entity.DoctorDetails;
import com.doctor.entity.PatientDetails;
import com.doctor.service.CommentsService;
import com.doctor.service.DoctorService;
import com.doctor.service.NurseService;
import com.doctor.service.PatientService;

@RestController
@RequestMapping("/api/")
public class doctorController {
	
	@Autowired
	private DoctorService doctorService;
	
	@Autowired
	private NurseService nurseService;
	
	@Autowired
	private PatientService patientService;
	
	@Autowired
	private CommentsService commentsService;
	
	
	@PostMapping("/savecomments")
	public Comments saveComment(@RequestBody Comments comments){
	
		return commentsService.saveComment(comments);
		
		
	}
	
	
	
	@PostMapping("/comments")
	public Comments createComments(@RequestBody Comments comments){
		
		return commentsService.createComments(comments);
		
		
	
	}
	
		
	
	@PutMapping("/patients/{id}")
	public void updatePatientStatus(@PathVariable int id) {
	    patientService.updatePatientStatus(id);
	}
	
	/*@GetMapping("/patients/{id}/status")
	public boolean getPatientStatusBYId(@PathVariable("id") Long id ){
		PatientDetails patient= patientService.getById(id);
		
		return patient.isActive();
		
		
	}*/
	
	
/*	@GetMapping("/patientlist/{id}")
	public List<PatientDetails> getPatientList(){
	
		return patientService.getPatients();
	}*/
	
	
	
	@GetMapping("/patientlist/{id}")
	public List<PatientDetails> getPatientList(@PathVariable("id") DoctorDetails docId){
		return patientService.getAllPatientsByDoctorId(docId);
		
		
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	@PostMapping("/commentsbypatientid")
	public List<Comments> getCommentsByPatientId(@RequestBody Long patientId){
		
		return commentsService.getCommentsByPatientId(patientId);
	}

	

}
