package com.org.flowcontrol10;

public class Grades {
/*public void grade(int marks)
{
	if(marks>85)
		System.out.println("A-Grade");
	else if(marks<=85&&marks>=61)
		System.out.println("B-Grade");
	else if(marks<=60&&marks>=36)
		System.out.println("C-Grade");
	else
		System.out.println("fail");
	
}*/
	public void findMarksGrade(int marks)
	{
		switch(marks/10) {
	
		case 10:
		case 9:
			System.out.println("marks are in between 81 to 100-A Grade");
			break;
			
		case 8:
		case 7:
			System.out.println("marks are in between 61 and 80-B Grade");
			break;
		case 6:
		case 5:
			System.out.println("marks are  in between 35 and 60-C grade");
			break;
		case 4:
		case 3:
		case 2:
		case 1:
			System.out.println("maks are below 35-falied");
			break;
			
		}
	}
}
