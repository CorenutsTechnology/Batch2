package com.crnuts.Class;

public class Student extends Teacher {

//this keyword is used for current object calling address
	//super keyword

	public String sName;

	public Student(String sName) {
		this.sName = sName;
	}

	public Student() {
		this.sName = "Unknown";
	}

	public Student(int rollNo) {
		super("Shejal");
		System.out.println("Every student has unique roll number.");
	}

	public Student(int standard, char section) {
		this(45);
		System.out.println(standard + "-" + section);
	}
	
	@Override
	public void PTM() {
		super.PTM();
		System.out.println("super keyword is used for calling super class method.");
	}
//
//	public void isNamePresent(String name) {
//
//		if (name.equals("")) {
//			System.out.println("Unknown");
//		} else {
//			System.out.println("Student name is " + name);
//		}
//	}

}
