package com.onlineportal.tp.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table( name = "Assessment")
public class AssessmentBean   {

	@Id private String testId;
	private String courseId;
	private String facultyId;
	private Question question[];
	
	
		
	public Question[] getQuestion() {
		return question;
	}
	public void setQuestion(Question question[]) {
		this.question = question;
	}
	public String getTestId() {
		return testId;
	}
	public void setTestId(String id) {
		this.testId = id;
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

