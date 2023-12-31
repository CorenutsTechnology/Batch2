package com.assignment.nov11;

public class Sort17 {

	public void sortArray(int[] array)
	{
		System.out.println("array sorting is started....");
		for(int index1 = 0;index1<array.length;index1++)
		{
			for(int index2 = 0;index2<array.length;index2++)
			{
				if(array[index1] < array[index2])
				{
					int temp =array[index1] ;
					array[index1] =array[index2];
					array[index2]=temp; 
				}
			}
		}
		System.out.println("sorting completed...");
	}
	public static void main(String[] args) 
	{
		int[] array = new int[] { 1, 34, 23, 90, 67 };
		Sort17 sort = new Sort17();
		sort.sortArray(array);
		System.out.println("sorted array is:");
		for(int value:array)
		{
			System.out.println(value);
		}
	}

}
