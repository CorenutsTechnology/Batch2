package com.arrays.nov8;
import java.util.Scanner;
public class IntMultiDimensionalArray 
{

	static Scanner sc = new Scanner(System.in);
	void function1(int[][] array)
	{
	
		System.out.println("enter values into array");
		//length of multidimensional array is same as first dimension
		System.out.println("size of array is: "+array.length);
		for(int index1 = 0;index1<array.length ;index1++)
		{
			for(int index2 =0 ;index2<array[index1].length ; index2++)
			{
				array[index1][index2]=sc.nextInt();
			}
		}
	}
	void print(int[][] array)
	{
		for(int index1 = 0;index1<array.length ;index1++)
		{
			for(int index2 =0 ;index2<array[index1].length ; index2++)
			{
				System.out.print(array[index1][index2]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int[][] array = new int[size][];
		
		System.out.println("enter sizes of internal array dimensions");
		for(int index=0;index<array.length;index++)
		{
			array[index]=new int[sc.nextInt()];
		}
		
		IntMultiDimensionalArray object = new IntMultiDimensionalArray();
		
		//function to assign values to array
		object.function1(array);
		
		//function to print values
		object.print(array);
	}

}
