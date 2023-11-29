package com.crnt.flowcontrols.nov1423;

public class First20FibbonacciNumbers {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=0;
		int sum=0;
		for (int i=0;i<=20;i++)
		{
		 c=a+c;
		 System.out.println(c);
		 sum=sum+c;
		 a=b;
		 b=c;
		
		
		}
		System.out.println("The average is : "+(sum)/20);
	
	}

}
