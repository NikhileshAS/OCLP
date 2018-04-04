package com.onlineportal.tp.bean;

import javax.persistence.Id;

public class CourseBean {
	@Id
	private String couseId;
	private String courseName;
	private int noOfStudentsEnrolled;
	private double clearingCutOff;
	private String facultyId;
	
	
	public CourseBean() {
		super();
		
		// TODO Auto-generated constructor stub
	}
	
	public String getCouseId() {
		return couseId;
	}
	public void setCouseId(String couseId) {
		this.couseId = couseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getNoOfStudentsEnrolled() {
		return noOfStudentsEnrolled;
	}
	public void setNoOfStudentsEnrolled(int noOfStudentsEnrolled) {
		this.noOfStudentsEnrolled = noOfStudentsEnrolled;
	}
	public double getClearingCutOff() {
		return clearingCutOff;
	}
	
	public void setClearingCutOff(float clearingCutOff) {
		this.clearingCutOff = clearingCutOff;
	}
	public String getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(String facultyId) {
		this.facultyId = facultyId;
	}
	
	
	
	

}
