package com.onlineportal.tp.bean;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table( name = "Student")
public class StudentBean {
	
	@Id	private String studId ;
	private String studPassword;
	private String studName;
	private String dateOfBirth;
	private String gender;
	private String department;
	private String emailId;
	private String contactNo;
	private String street;	
	private String location;
    private String city;
	private String state;
	private String pincode;
	private float testStatus ;
	private String courseId ;
	private String testId ;
	private double cgpa;
		
	public String getStudId() {
		return studId;
	}
	public String getStudPassword() {
		return studPassword;
	}
	public void setStudPassword(String studPassword) {
		this.studPassword = studPassword;
	}
	public void setStudId(String studId) {
		System.out.println("Bean:"+studId);
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public float getTestStatus() {
		return testStatus;
	}
	public void setTestStatus(float testStatus) {
		this.testStatus = testStatus;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getTestId() {
		return testId;
	}
	public void setTestId(String testId) {
		this.testId = testId;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

}
