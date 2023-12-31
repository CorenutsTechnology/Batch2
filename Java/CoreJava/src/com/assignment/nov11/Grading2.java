package com.assignment.nov11;

import java.util.Scanner;

public class Grading2 
{
	String checkGrade(int marks) 
	{
		if(marks>=90)
			return "A";
		else if(marks<90 && marks >=80)
			return "B";
		else if(marks<80 && marks >=70)
			return "C";
		else if(marks<70 && marks >=60)
			return "D";
		else if(marks<60 && marks >=50)
			return "B";
		else
			return "F";
	}
	String checkGradeUsingSwitch(int marks)
	{
		switch(marks/10)
		{
			case 10:
			case 9:
				return "A";
			case 8:
				return "B";
			case 7:
				return "C";
			case 6:
				return "D";
			case 5:
				return "E";
			default:
				return "Fail";
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Marks for 100: ");
		int marks = sc.nextInt();
		Grading2 gradeUsingIfElse = new Grading2();
		System.out.println("Your Grade is: " + gradeUsingIfElse.checkGrade(marks));
		System.out.println("Enter your Marks for 100: ");
		int marks2 = sc.nextInt();
		System.out.println("Your Grade is: " + gradeUsingIfElse.checkGradeUsingSwitch(marks2));
		sc.close();
	}

}
