package com.student.dto;

public class ErrorMessageBean
{
	private String errorMessage;
	private String location;
	private int statuscode;
	public ErrorMessageBean() {
		
	}
	public ErrorMessageBean(String errorMessage, String location, int statuscode) {
		super();
		this.errorMessage = errorMessage;
		this.location = location;
		this.statuscode = statuscode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	
	
	
}
