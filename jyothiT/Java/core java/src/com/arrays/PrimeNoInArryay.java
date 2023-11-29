package com.arrays;

public class PrimeNoInArryay {

	public static void main(String[] args) {
		int[] array= {3,5,2,7,10};
		primeno(array);

	}
	static void primeno(int[] arr)
	{
		
		boolean flag=true;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=2;j<arr[i]/2;j++)
			{
			  if(arr[i]%i==0)
			  {
				  flag=false;
				  break;
			  }
			}
			if(true)
			{
				System.out.println(arr[i]+" is a prime number");
			}
		}
	}

}
