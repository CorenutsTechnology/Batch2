package com.org.flowcontrol10;

public class TimeTable {
public void multiplicationTable(int rows,int columns)
{
	for(int start=1;start<=rows;start++)
	{
		for(int uptoNumber=1;uptoNumber<=columns;uptoNumber++)
		{
			System.out.print((start*uptoNumber)+" ");
		}
		System.out.println();
	}
}
}
