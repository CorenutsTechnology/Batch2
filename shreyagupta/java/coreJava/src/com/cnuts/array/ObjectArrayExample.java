package com.cnuts.array;

public class ObjectArrayExample {
	public static void main(String[] args) {

		Student[] studentArray=new Student[3];
		ObjectArrayExample.detailsOfStudent(studentArray);




	}

	public static void detailsOfStudent(Student[] studentArray) 
	{


		Student student1=new Student("shreya", 16, "10th", 87);
		Student student2=new Student("manish", 16, "10th", 79);
		Student student3=new Student("priya", 16, "10th", 54);

		studentArray[0]=student1;
		studentArray[1]=student2;
		studentArray[2]=student3;

		System.out.println(student1.getAge());
		System.out.println(student1.getStandard());

	}



}
