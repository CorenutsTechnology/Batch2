package com.feuji8nov;

public class IntArray 
{
	public int[] arrayDetails(int[] array)
	{
		
		  array[0]=10; array[1]=20; array[2]=30; array[3]=40; array[4]=50;
		 
		System.out.println(array[0]); 
		System.out.println(array[1]);
		System.out.println(array[2]); 
		System.out.println(array[3]);
		return array;
		
	}

	public static void main(String[] args) 
	{
		int array[]=new int[5];
		//int array[]= {10,20,30,40,50};
		/*
		 * array[0]=5; array[1]=10; array[2]=20; array[3]=30;
		 */
		/*
		 * System.out.println(array[0]); System.out.println(array[1]);
		 * System.out.println(array[2]); System.out.println(array[3]);
		 */
		IntArray result=new IntArray();
		
		int[] arrays=result.arrayDetails(array);
		/*
		 * anonymous array int[]arrays=result.arrayDetails(new int[] {10,20,30,40,50});
		 */
		System.out.println(arrays);
			}

}
