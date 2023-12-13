package com.org.programs14;

public class Searching {
//public int linearSearch(int[]array,int searchEle)
//{
//	for(int start=0;start<array.length;start++)
//	{
//		if(array[start]==searchEle)
//		
//			return start;
//	}
//	return -1;
//}
public int binarySearch(int[]array,int searchElement)
{
	int first=0;int last=array.length-1;
	while(first<last)
	{
	int midIndex=(first+last)/2;	
	if(searchElement==array[midIndex])
	{
		return midIndex;
	}
	else if(searchElement<array[midIndex])
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