package com.onlineportal.tp.bean;

public class CourseBean {
	private String couseId;
	private String courseName;
	private int noOfStudentsEnrolled;
	private float clearingCutOff;
	private String facultyId;
	private int courseCount=0;
	
	
	public CourseBean() {
		super();
		courseCount++;
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
	public float getClearingCutOff() {
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
	public int getCourseCount() {
		return courseCount;
	}
	public void setCourseCount(int courseCount) {
		this.courseCount = courseCount;
	}
	
	
	

}
