package com.org.flowcontrol10;

import java.util.Scanner;

public class MaxMinAvergMain {

	public static void main(String[] args) {
		FindMinMaxAverg findMinMaxAverg=new FindMinMaxAverg();
		Scanner sc=new Scanner(System.in);
		
		int numSubjects=5;
		int[] marks=new int[numSubjects];
		for(int start=0;start<marks.length;start++)
		{
			System.out.println("Enter marks for subject"+(start+1));
			marks[start]=sc.nextInt();
		}
		
		findMinMaxAverg.maximumMarks(marks);
		findMinMaxAverg.minimumMarks(marks);
		findMinMaxAverg.averageMarks(marks);
		
	}

}
