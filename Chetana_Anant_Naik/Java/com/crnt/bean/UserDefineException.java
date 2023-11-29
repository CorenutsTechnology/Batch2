package com.crnt.bean;

public class UserDefineException extends Exception{
	private static final long serialVersionUID = -8265935429889017955L;
 
	public UserDefineException(String msg){
		super(msg);
	}
	public UserDefineException(String msg, Exception exception){
		super(msg,exception);
	}
	
	
}
