package com.arrays;

public class SumOfArrayElements {

	public static void main(String[] args) {
		int[] array= {10,20,30,40};
		add(array);

	}
	static void add(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
