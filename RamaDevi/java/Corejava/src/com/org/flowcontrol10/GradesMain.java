package com.org.flowcontrol10;

import java.util.Scanner;

public class GradesMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks");
		int marks=sc.nextInt();
		Grades grade=new Grades();
		grade.findMarksGrade(marks);

	}

}
