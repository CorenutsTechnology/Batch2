package com.org.flowcontrol10;

public class MaxAndMinInArray {
	public void minAndMax()
	{
		int[] array= {6,4,9,2,8};
		int max=array[0];
		int min=array[0];
		for(int start=1;start<array.length;start++)
		{
				if(array[start]>max)
				{
					max=array[start];
				}
			
				if(array[start]<min)
				{
					min=array[start];
				}
			
		}
		System.out.println(max);
		System.out.println(min);
	}
public static void main(String[] args) {
	MaxAndMinInArray maxAndMinInArray=new MaxAndMinInArray();
	maxAndMinInArray.minAndMax();

}

}
