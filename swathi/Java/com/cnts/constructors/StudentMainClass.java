package com.cnts.constructors;

public class StudentMainClass {
	public static void main(String[] args) {
		Student student1=new Student();
	    System.out.println(student1.name1);
		Student student=new Student("swathi",null,101);
	   
		if(student.name2==null) {
			System.out.println("Unknown");
		}
		  student.displayMessage();
		
		
		
	}

}
