package com.crnt.constructors.nov2323;

public class StudentClass {
	private String names;

	public StudentClass(String names) {
		super();
		this.names = names;
	}

	public StudentClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	@Override
	public String toString() {
		return "StudentClass [names=" + names + "]";
	}
	

}
