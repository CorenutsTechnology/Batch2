package com.feuji14nov;

public class InsertionSort 
{
	public int[] insertionSort(int[]arr)
	{
		for(int index=0;index<=arr.length-1;index++)
		{
			int key=arr[index];
			int temp=index-1;
			while((temp>=0)&&(arr[temp]>key))
					{
				arr[temp+1]=arr[temp];
				temp--;
					}
			arr[temp+1]=key;
		}
		return arr;	
	}
	public static void main(String[] args) 
	{
		InsertionSort sort=new InsertionSort();
		
		int result[]=sort.insertionSort(new int[] {12,34,56,78,9,31});
		for(int i=0;i<=result.length-1;i++)
		{
			System.out.println(result[i]);
		}
		
	}

}
