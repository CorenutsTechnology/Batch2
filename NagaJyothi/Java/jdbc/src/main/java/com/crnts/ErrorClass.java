package com.crnts;

public class ErrorClass 
{
	private int errorCode;
	private String errorMessage;
	private String location;
	
	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
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

	@Override
	public String toString() {
		return "ErrorClass [errorCode=" + errorCode + ", errorMessage=" + errorMessage + ", location=" + location + "]";
	}
	
	

}
