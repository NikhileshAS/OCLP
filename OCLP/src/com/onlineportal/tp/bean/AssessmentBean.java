package com.onlineportal.tp.bean;
import java.util.Date;

public class AssessmentBean {

	private String TestId;
	private Date time;
	private Date notifyDate;
	private String type; 
	private String courseId;
	private String facultyId;
	public String getTestId() {
		return TestId;
	}
	public void setTestId(String testId) {
		TestId = testId;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Date getNotifyDate() {
		return notifyDate;
	}
	public void setNotifyDate(Date notifyDate) {
		this.notifyDate = notifyDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(String facultyId) {
		this.facultyId = facultyId;
	}
	
	

}
