//3. Declare array with negative size and print the values without using loops?

package com.arrays.nov8;

public class NegativeSizeArray3 {

	void printArray(int[] array)
	{
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
	}
	
	public static void main(String[] args) 
	{
		/*
		 * array declaration with negative size will throw runtime exception(NegativeArraySizeException)
		 */
		int[] array = new int[-5];
		NegativeSizeArray3 object = new NegativeSizeArray3();
		
		object.printArray(array);
	}

}
