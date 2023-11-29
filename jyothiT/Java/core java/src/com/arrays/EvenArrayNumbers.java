package com.arrays;

public class EvenArrayNumbers {

	public static void main(String[] args) {
	    int[] array= {2,6,12,1,2,3,9,3,6,6,6,6};
	    primeNo(array);

	}

	private static void primeNo(int[] array) {
		  int ele=0; 
		  int count=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2==0)
			{
			   ele=array[i];
			   count++;
			}
			
		}
		if(count>=2)
		{
			System.out.println("the array contains more than 2 even elements");
			System.out.println(count);
		}
		
	}

}
