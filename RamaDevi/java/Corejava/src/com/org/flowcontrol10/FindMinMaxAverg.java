package com.org.flowcontrol10;

public class FindMinMaxAverg {
public void maximumMarks(int[]marks)
{
	int maxMarks=marks[0];
	for(int start=0;start<marks.length;start++)
	{
		int mark=marks[start];
		if(marks[start]>maxMarks) {
		maxMarks=mark;	}
	}
	System.out.println("maxMarks is:"+maxMarks);
}
public void minimumMarks(int[]marks)
{
	int minMarks=marks[0];
	for(int start=0;start<marks.length;start++)
	{
		int mark=marks[start];
		if(marks[start]<mark) {
		minMarks=mark;	}
	}
	System.out.println("minMarks is:"+minMarks);
}
public void averageMarks(int[]marks)
{
	int totalMarks=0;
	for(int start=0;start<marks.length;start++)
	{
		totalMarks+=marks[start];
	}
	double averagemarks=totalMarks/marks.length;
	System.out.println("average marks is:"+averagemarks);
}
}
