package com.assignment.nov11;

public class Searching {

	public String linearSearch(int[] array , int element)
	{
		for(int index1 = 0;index1<array.length;index1++)
		{
			if(array[index1]==element)
				return "found";
		}
		return "not found";
			
	}
	
	public String binarySearch(int[] array , int element)
	{
		//this is to sort an array
		Sorting18 sorting18 = new Sorting18();
		sorting18.bubbleSort(array);
		return search(array,0,array.length-1,element);
	}
	public String search(int[] array , int low ,int high , int element)
	{
		int mid=(low+high)/2;
		if(array[mid]== element)
			return "found";
		else if(array[mid]>element)
			return search(array,low,mid,element);
		else if(array[mid]<element)
			return search(array,mid+1,high,element);
		else
			return "not found";
	}
	public static void main(String[] args) 
	{
		Searching searching = new Searching();
		String result=searching.linearSearch(new int[] {12,34,23,67,56} , 10);
		System.out.println("given element is "+result);
		
		String result2=searching.binarySearch(new int[] {12,34,23,67,56} , 34);
		System.out.println("given element is "+result2);
		
		
		
	}

}
