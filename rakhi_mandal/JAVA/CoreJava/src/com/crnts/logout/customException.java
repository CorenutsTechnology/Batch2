package com.crnts.logout;

public class customException extends RuntimeException {
	public customException(String message, Exception exception) {
		super(message, exception);
		// TODO Auto-generated constructor stub
	}

	public customException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}
