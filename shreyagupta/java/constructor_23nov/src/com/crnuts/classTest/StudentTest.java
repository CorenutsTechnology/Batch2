package com.crnuts.classTest;

import java.util.Scanner;

import com.crnuts.Class.Student;

public class StudentTest {
//QUES 1,this(),super()
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name:");
		String name = sc.nextLine();
		
		Student student = new Student(name);
		Student student1 = new Student();
		

		System.out.println("name: " + student.sName);

		System.out.println(student1.sName);
		
		System.out.println("------this & super statement------");
		Student student2=new Student(10,'A');
		
		System.out.println("-------super keyword--------");
		student.PTM();

	}

}
