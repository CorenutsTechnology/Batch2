package com.feuji14nov;

import java.util.Random;

public class RandomNumbers 
{
	
	public void checkRandomNumbers(int num1,int num2)
	{
		if(num1>num2)
		{
			System.out.println(num1+" is Greater than "+num2);
		}
		else if(num1<num2)
		{
			System.out.println(num1+" is Less than "+num2);
		}
		else if(num1==num2)
		{
			System.out.println(num1+" equal "+num2);
		}

	}
	public static void main(String[] args) 
	{
		Random random=new Random();
		RandomNumbers numbers=new RandomNumbers();
		int num1=random.nextInt(100);
		int num2=random.nextInt(100);
		int num3=random.nextInt(100);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println("compare"+ num1+" and "+ num2);
		numbers.checkRandomNumbers(num1, num2);
		System.out.println("compare "+num2 +"and "+ num3);
		numbers.checkRandomNumbers(num2, num3);
		System.out.println("compare"+ num3+" and "+ num1);
		numbers.checkRandomNumbers(num3, num1);
		System.out.println("Random numbers by using maths method "+Math.random()*1000);
		
	}
}
