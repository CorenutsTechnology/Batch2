package com.feuji8nov;

import com.feuji.bean.Student;

public class StudentArray
{
		public static void main(String[] args) 
	{
		StudentArray sArray=new StudentArray();
		Student [] result=sArray.studentDetails();
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result[2]);
		System.out.println(result[3]);
		
	}

	public Student[] studentDetails() 
	{
		Student[]studentArray=new Student[4];
		Student student0=new Student();
		studentArray[0]=student0;
		student0.setName("jyothi");
		student0.setRollNo(0);
		student0.setAdd("hyd");
		
		Student student1=new Student();
		studentArray[1]=student1;
		student1.setName("mouni");
		student1.setRollNo(1);
		student1.setAdd("hyd");
		
		Student student2=new Student();
		studentArray[2]=student2;
		student2.setName("indu");
		student2.setRollNo(2);
		student2.setAdd("hyd");
		
		Student student3=new Student();
		studentArray[3]=student3;
		student3.setName("puri");
		student3.setRollNo(3);
		student3.setAdd("hyd");
		return studentArray;
		
		

		
		
		
		
		
		
		
		
	}
	

}
