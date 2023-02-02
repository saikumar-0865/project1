package com.doctor.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class DoctorDetails {

	@Id
	@Column(name = "doctorId")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int doctorId;
	private String name;
	private String pnumber;
	private String specialization;
	private boolean avaliability;
	private boolean approval;
	//private Set<Hospital> hospitals;
	
	@OneToOne(targetEntity = Hospital.class)
	@JoinColumn(name= "hospitalId", referencedColumnName = "hospitalId")
	private Hospital hospitalId;

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPnumber() {
		return pnumber;
	}

	public void setPnumber(String pnumber) {
		this.pnumber = pnumber;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public boolean isAvaliability() {
		return avaliability;
	}

	public void setAvaliability(boolean avaliability) {
		this.avaliability = avaliability;
	}

	public boolean isApproval() {
		return approval;
	}

	public void setApproval(boolean approval) {
		this.approval = approval;
	}

	public Hospital getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(Hospital hospitalId) {
		this.hospitalId = hospitalId;
	}

	public DoctorDetails(int doctorId, String name, String pnumber, String specialization, boolean avaliability,
			boolean approval, Hospital hospitalId) {
		super();
		this.doctorId = doctorId;
		this.name = name;
		this.pnumber = pnumber;
		this.specialization = specialization;
		this.avaliability = avaliability;
		this.approval = approval;
		this.hospitalId = hospitalId;
	}

	public DoctorDetails() {
		super();
	}

	public DoctorDetails(String name, String pnumber, String specialization, boolean avaliability, boolean approval,
			Hospital hospitalId) {
		super();
		this.name = name;
		this.pnumber = pnumber;
		this.specialization = specialization;
		this.avaliability = avaliability;
		this.approval = approval;
		this.hospitalId = hospitalId;
	}
	
	
	
	
	
	

	/*

	public DoctorDetails(int doctorId, String name, String pnumber, String specialization, boolean avaliability,
			boolean approval, Set<Hospital> hospitals) {
		super();
		this.doctorId = doctorId;
		this.name = name;
		this.pnumber = pnumber;
		this.specialization = specialization;
		this.avaliability = avaliability;
		this.approval = approval;
		this.hospitals = hospitals;
	}

	public DoctorDetails(String name, String pnumber, String specialization, boolean avaliability, boolean approval,
			Set<Hospital> hospitals) {
		super();
		this.name = name;
		this.pnumber = pnumber;
		this.specialization = specialization;
		this.avaliability = avaliability;
		this.approval = approval;
		this.hospitals = hospitals;
	}*/


}
