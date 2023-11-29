package com.crnt.constructors.nov2323;

public class StudentTest {
	public static void main(String[] args) {
		StudentClass student = new StudentClass();
		student.setNames("srilatha");
		
		StudentClass student2 = new StudentClass();
		student2.setNames(null);
		
		System.out.println(student.getNames());
		
		if(student2.getNames()==null)
		{
			System.out.println("unknown");
		}
	}
	
	

}
