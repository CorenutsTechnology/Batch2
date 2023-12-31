//4. Write a program to sum all the values in array without using loops

package com.arrays.nov8;
public class SumOfArrayValues4 {

	int totalSum =0;
	int index=0;
	void sumOfArray(int[] array)
	{
		if(index<array.length)
		{
			totalSum+=array[index++];
			sumOfArray(array);
		}
		else
		{
			System.out.println("total sum is: "+totalSum);
		}
		
	}
	public static void main(String[] args) 
	{
		
		int[] array = new int[6];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		array[4]=50;
		array[5]=50;
		
		SumOfArrayValues4 object = new SumOfArrayValues4();
		object.sumOfArray(array);
	}

}
