package com.org.programs14;

import java.util.Scanner;

public class FibanacciNumber {
	public void fibancci(int number)
	{
		int firstValue=1;
		int secondValue=1;
		int thirdValue;
		int sum=0;
		for(int i=1;i<=number;i++)
		{
			System.out.println(firstValue+" ");
			sum+=firstValue;
			thirdValue=firstValue+secondValue;
			firstValue=secondValue;
			secondValue=thirdValue;
		}
		double average=sum/number;
		System.out.println("The average is:"+average);
	}
	
	
}
