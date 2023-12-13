package com.feujitest14nov;

import java.util.Scanner;

public class AssendingNDesending 
{
	Scanner scan=new Scanner(System.in);
	
	public int[] assendingOrder(int[] array)
	{
		for(int index=0;index<=array.length-1;index++)
		{
			for(int index1=index+1;index1<=array.length-1;index1++)
			{
				if(array[index]>array[index1]) {
					int temp=array[index];
					array[index]=array[index1];
					array[index1]=temp;
				}
								
			}
			
		}
		return array;
	}
    public int[] desendingOrder( int[] array)
    {
    	for(int index=0;index<=array.length-1;index++)
		{
			for(int index1=index+1;index1<=array.length-1;index1++)
			{
				if(array[index]<array[index1]) {
					int temp=array[index];
					array[index]=array[index1];
					array[index1]=temp;
				}
								
			}
    	}
      return array;
    }
}
