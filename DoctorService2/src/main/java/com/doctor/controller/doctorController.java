package com.doctor.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doctor.entity.Comments;
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
	
	
	/*@PutMapping("/")
	public ResponseEntity<String> updatePatientStatus(@PathVariable int id){
		patientService.updatePatientStatus(id);
		return ResponseEntity.ok("patientstatus saved");
		
		
	}*/
	
	
	@PutMapping("/patients/{id}")
	public void updatePatientStatus(@PathVariable int id) {
	    patientService.updatePatientStatus(id);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

}
