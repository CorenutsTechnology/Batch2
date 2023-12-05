//1. Write a program to convert an array to collection?

package com.crnts.List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayToCollection {

	public static void main(String[] args) {
		ArrayToCollection arrayToCollection=new ArrayToCollection();
		arrayToCollection.convertArrayToCollection();
	}
	
	public void convertArrayToCollection()
	{   
		
		Integer array[]= {1,4,2,2,2};
		List<Integer> list1=Arrays.asList(array);
		//Using for each loop
		for(Object item:list1)
		{
			System.out.print(item+" ");
		}
		System.out.println();
		
		//using iterator
		Iterator<Integer> listWithIterator=list1.iterator();
		while(listWithIterator.hasNext())
		{
			System.out.print(listWithIterator.next()+" ");
		}
		
	}
	
	
}
