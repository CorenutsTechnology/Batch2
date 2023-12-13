package com.feuji14nov;

public class SelectionSort 
{
	public int[] selectionSort(int arr[])
	{
		for(int index1=0;index1<=arr.length-1;index1++)
		{
			int temp=index1;
			for(int index2=index1+1;index2<=arr.length-1;index2++)
			{
				if(arr[temp]>arr[index2])
				{
					temp=index2;
				}
			}
			int smallNo=arr[index1];
			arr[index1]=arr[temp];
			arr[temp]=smallNo;
			
		}
		return arr;
	}
	public static void main(String[] args) 
	{
		SelectionSort sort=new SelectionSort();
		int result[]=sort.selectionSort(new int[] {9,14,-3,-90,43,11,58,22});
		for(int i=0;i<=result.length-1;i++)
		{
			System.out.println(result[i]);
		}
		
		
	}

}
