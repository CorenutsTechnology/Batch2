package com.cnuts.array;

public class Student {
	private String name;
	private int age;
	private String standard;
	private int totalMarks;
	
	
	
	public Student(String name, int age, String standard, int totalMarks) {
		super();
		this.name = name;
		this.age = age;
		this.standard = standard;
		this.totalMarks = totalMarks;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	public String getStandard() {
		return standard;
	}


	public void setStandard(String standard) {
		this.standard = standard;
	}


	public int getTotalMarks() {
		return totalMarks;
	}


	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", standard=" + standard + ","
				+ " totalMarks=" + totalMarks + "]";
	}


	
	
	

	
	
	

}
