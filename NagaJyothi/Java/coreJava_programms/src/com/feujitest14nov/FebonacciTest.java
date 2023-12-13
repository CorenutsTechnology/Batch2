package com.feujitest14nov;

public class FebonacciTest 
{
	public void fibonnaciNo()
	{
		int a=0;
		int b=1;
	    int c=0;
	    int sum=0;
		for(int index=1;index<=20;index++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
			sum=sum+c;
		}
		double avg=sum/20;
		System.out.println("Average:"+avg);
	}

}
