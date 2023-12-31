//program to represent primitive array
package com.arrays.nov8;

import java.util.Scanner;

public class IntArray 
{
	static int[] arrayFunction(int[] array)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values into array");
		for(int index=0;index<array.length;index++)
		{
			array[index]=sc.nextInt();
		}
		sc.close();
		return array;
	}

	public static void main(String[] args) 
	{
//		int[] array = new int[5];
//		arrayFunction(array);
		
		char[] ch = new char[3];
		System.out.println(ch[0]);
		int[] array=arrayFunction(new int[] {0,0,0,0,0});//it is known as anonymous array
		for(int value:array)
		{
			System.out.print(value+" ");
		}
	}

}
