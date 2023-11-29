package com.crnt.assaignment.nov13;

import java.util.Scanner;

public class GradeSwitchIfElse {
	public static void main(String[] args) {
		GradeSwitchIfElse grade = new GradeSwitchIfElse();
		//grade.switchCase();
		grade.ifElseCase();
		
	}
	public void ifElseCase()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your marks : ");
		int marks = scan.nextInt();
		if (marks>=80 && marks<=100) {
			System.out.println("The grade of the student is A");
			
		}
		else if (marks>=60 && marks<=80)
		{
			System.out.println("The grade of the student is B");
		}
		else if (marks>=40 && marks<=60)
		{
			System.out.println("The grade of the student is C");
		}
		else if (marks>=35)
		{
			System.out.println("The grade of the student is D");
		}
		else {
			System.out.println("student fail");
		}
		
		
	}
	public void switchCase()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your grade : ");
		int grade = scan.next().charAt(0);
		switch (grade) {
		case 'A' :
		case 'a' :System.out.println("the grade of student is A");
			
			break;
		case 'B' :
		case 'b' :System.out.println("the grade of student is B");
			
			break;
		case 'C' :
		case 'c' :System.out.println("the grade of student is C");
			
			break;
		case 'D' :
		case 'd' :System.out.println("the grade of student is D");
			
			break;

		default:
			break;
		}
	}

}
