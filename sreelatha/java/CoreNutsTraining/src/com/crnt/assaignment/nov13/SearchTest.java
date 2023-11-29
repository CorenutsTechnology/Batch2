package com.crnt.assaignment.nov13;

public class SearchTest {
//	public int search(int arr [] , int searchEle)
//	{
//		for(int index=0;index<=arr.length-1;index++)
//		{
//			if (searchEle==arr[index]) {
//				
//				
//				return index;
//				
//			}
//			
//		}
//		return -1;
//		
//		
//	}
	public int binarySearch(int [] array , int searchElement)
	{
		int first =0;
		int last = array.length-1;
		while(first<last)
		{
			int midIndex=(first+last)/2;
			if(searchElement==array[midIndex])
			{
				return midIndex;
			}
			else if (searchElement<array[midIndex])
			{
				last=midIndex-1;
			}
			else
			{
				first=midIndex+1;
			}
		}
		return -1;
		
	}

}
