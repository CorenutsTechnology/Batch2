package com.assignment.nov11;

import java.util.Random;

public class Random22 {

	public void generate(int[] random)
	{
		// program that generates 25 random int values. 
		Random randomObject = new Random();
		for(int index=0;index<25;index++)
		{
			random[index]=randomObject.nextInt(100);
			System.out.println(random[index]);
		}
		//if-else statement to classify it as greater than, less than, 
		//or equal to a second randomly-generated value

		for(int index=0;index<random.length-1;index++)//index++
		{
			if(random[index]== random[index+1])
				System.out.println("equal");
			else if(random[index]< random[index+1])
				System.out.println("first is less than second");
			else
				System.out.println("first is greater than second");
		}
		
	}
	public static void main(String[] args) 
	{
		Random22 random22 = new Random22();
		int[] random = new int[25];
		random22.generate(random);
	}

}
