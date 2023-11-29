package com.crnt.assaignment.nov13;

import java.util.Iterator;
import java.util.Random;

public class Random25Values {
public static void main(String[] args) {
	Random r = new Random();
	int number;
	for(int index=0;index<5;)
	{
		number=r.nextInt(5);
		System.out.print(number);
		int value =r.nextInt(5);
		System.out.println("..........");
		System.out.print(value);
		if(value>number)
		{
			System.out.println(value+" is greater than number"+number);
		}
		else if (value<number)
		{
			System.out.println("value"+value+" is less than number"+number);
		}
		
		else 
		{
			System.out.println("value"+value+" is equal to the number"+number);
		}
		
	
	}
}
}
