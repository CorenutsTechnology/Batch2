package com.org.flowcontrol10;

import java.util.Scanner;

public class MaximumValue {
	public void maxNumber()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
    int firstValue=sc.nextInt();
    System.out.println("Enter second number");
    int secondValue=sc.nextInt();
    System.out.println("Enter first number");
    int thirdValue=sc.nextInt();
    if(firstValue>secondValue&&secondValue>thirdValue)
    {
    	System.out.println(firstValue+" is max");
    }
    else if(secondValue>firstValue&&secondValue>thirdValue)
    {
    	System.out.println(secondValue+" is max");
    }
    else 
    	System.out.println(thirdValue+" is max");
	}
	public static void main(String[] args) {
		MaximumValue maximumValue=new MaximumValue();
		maximumValue.maxNumber();
	}
}
