package com.onlineportal.tp.bean;

import java.io.InputStream;
import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table( name = "Book")
public class BookBean
{
	@Id	private String facultyId;
private Blob c;
private Blob cpp;
private Blob java;
private Blob aptitude;
private Blob dataStructure;
private Blob dbms;
private Blob cn;
private Blob os;

public Blob getC() 
{
	return c;
}

public String getFacultyId() {
	return facultyId;
}
public void setFacultyId(String facultyId) {
	this.facultyId = facultyId;
}
public void setC(Blob inputStream) {
	this.c = inputStream;
}
public Blob getCpp() {
	return cpp;
}
public void setCpp(Blob inputStream) {
	this.cpp = inputStream;
}
public Blob getJava() {
	return java;
}
public void setJava(Blob inputStream) {
	this.java = inputStream;
}
public Blob getAptitude() {
	return aptitude;
}
public void setAptitude(Blob inputStream) {
	this.aptitude = inputStream;
}
public Blob getDataStructure() {
	return dataStructure;
}
public void setDataStructure(Blob inputStream) {
	this.dataStructure = inputStream;
}
public Blob getDbms() {
	return dbms;
}
public void setDbms(Blob inputStream) {
	this.dbms = inputStream;
}
public Blob getCn()
{
	return cn;
}
public void setCn(Blob inputStream) {
	this.cn = inputStream;
}
public Blob getOs() {
	return os;
}
public void setOs(Blob inputStream) {
	this.os = inputStream;
}

}
