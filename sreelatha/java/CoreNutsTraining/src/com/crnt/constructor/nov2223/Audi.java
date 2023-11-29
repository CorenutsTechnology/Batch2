package com.crnt.constructor.nov2223;

public class Audi extends Car{
	
	public String getType() {
		
		return type;
	}

	public Audi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setType(String type) {
		
		this.type = type;
	}

	private String type;

	public Audi(String type) {
		super();
		
		this.type = type;
	}
	

}
