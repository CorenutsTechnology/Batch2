package com.cnts.nov10loops;

import java.util.Scanner;

public class GradeUsingIfElse 
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
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Marks for 100: ");
		int marks = sc.nextInt();
		GradeUsingIfElse gradeUsingIfElse = new GradeUsingIfElse();
		System.out.println("Your Grade is: " + gradeUsingIfElse.checkGrade(marks));
		sc.close();
	}

}