package com.feuji14nov;

import java.util.Scanner;

public class BinarySearch 
{
	Scanner scan=new Scanner(System.in);
	public int[] binarySearch(int[]arr)
	{
		System.out.println("Enter search element");
		int ele=scan.nextInt();
		int lower=arr[0];
		int heigher=arr[arr.length-1];
		while(lower<heigher)
		{
		int mid=(lower+heigher)/2;
		if(ele==arr[mid])
		{
			System.out.println("Element found");
		}
		else if(ele>arr[mid])
		{
			lower=mid+1;
			
		}
		else if(ele<arr[mid])
		{
			heigher=mid-1;
		}
		else
		{
			System.out.println("Not found");
		}
		
		
		}
		return arr;
		
	}
	public static void main(String[] args) 
	{
		BinarySearch search=new BinarySearch();
		search.binarySearch(new int[] {5,30,45,67,80,12});
		
		
	}

}
