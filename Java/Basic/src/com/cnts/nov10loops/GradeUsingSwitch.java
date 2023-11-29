package com.cnts.nov10loops;

import java.util.Scanner;
public class GradeUsingSwitch {

	String checkGrade(int marks) 
	{
		switch (marks / 10) 
		{
			// for >= 90
			case 10:
			case 9:
				return "A";
				
			// for >= 80 and <90
			case 8:
				return "B";
				
			// for >= 70 and <80
			case 7:
				return "C";
				
			// for >= 60 and <70
			case 6:
				return "D";
				
			// for >= 50 and <60
			case 5:
				return "E";
				
			// for < 50
			default:
				return "F";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Marks for 100: ");
		int marks = sc.nextInt();
		GradeUsingSwitch gradeUsingSwitch = new GradeUsingSwitch();
		System.out.println("Your Grade is: " + gradeUsingSwitch.checkGrade(marks));
		sc.close();
	}

}

