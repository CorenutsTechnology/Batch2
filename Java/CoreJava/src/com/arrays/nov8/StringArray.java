package com.arrays.nov8;

import java.util.Scanner;

public class StringArray {

	static String[] stringFunction(String[] array)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter strings into the array");
		for(int index=0;index<array.length;index++)
		{
			array[index]=sc.next();
		}
		sc.close();
		return array;
		
	}
	public static void main(String[] args) 
	{
		String[] stringArray = new String[5];
		
		stringFunction(stringArray);
		for(String value:stringArray)
		{
			System.out.println(value);
		}
	}

}
