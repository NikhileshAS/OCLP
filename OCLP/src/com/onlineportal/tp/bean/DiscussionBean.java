package com.onlineportal.tp.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Discussion")
public class DiscussionBean {

	@Id private String rollNum;
	private String name;
	private String message;
	
	public DiscussionBean(String rollNum, String name, String message) {
		super();
		this.rollNum = rollNum;
		this.name = name;
		this.message = message;
	}
	
	
	public String getRollNum() {
		return rollNum;
	}
	public void setRollNum(String rollNum) {
		this.rollNum = rollNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
