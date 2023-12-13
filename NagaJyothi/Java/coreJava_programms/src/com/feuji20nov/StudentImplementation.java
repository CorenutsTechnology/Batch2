package com.feuji20nov;

import java.io.FileNotFoundException;

public class StudentImplementation 
{
	public static void main(String[] args) 
	{
		Student result=new Student();
		try
		{
			result.marksAverage(new int[] {1,2,3,4});
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception handled:"+e.getMessage());
			e.printStackTrace();
		}
		StudentImplementation result1=new StudentImplementation();
		//result1.m1();
		
	}
	public void m1() throws Exception
	{
		m2();
	}
	public void m2()throws FileNotFoundException
	{
		
	}

}
