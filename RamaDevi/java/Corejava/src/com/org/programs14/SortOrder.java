package com.org.programs14;

import java.util.Arrays;

public class SortOrder {
	public void assending(int[]array)
	{
		for(int start=0;start<array.length;start++)
		{
			for(int iterate=0;iterate<array.length;iterate++)
			{
				if(array[start]<array[iterate])
				{
					int temp=array[start];
					array[start]=array[iterate];
					array[iterate]=temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
	public void descending(int[]array)
	{
		for(int start=0;start<array.length;start++)
		{
			for(int iterate=0;iterate<array.length;iterate++)
			{
				if(array[start]>array[iterate])
				{
					int temp=array[start];
					array[start]=array[iterate];
					array[iterate]=temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
}