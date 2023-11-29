package com.cnts.nov14;

import java.util.Random;

public class RandomNumber 
{
	public static void main(String[] args) {
		
		int size=25;
		int[] array1 =  new int[size];
		
		Random random = new Random();
		for(int i=0; i<array1.length; i++)
		{
			array1[i]=random.nextInt(50);
			System.out.println(array1[i]);
		}
		
		if(array1[0]>array1[1] || array1[0]<array1[1] || array1[0]==array1[1])
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
	}
}
