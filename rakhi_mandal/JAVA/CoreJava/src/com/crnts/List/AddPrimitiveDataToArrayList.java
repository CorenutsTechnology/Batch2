//Create a program to add primitive data type elements to array list object and display the elements using
//for loop and Iterator interface.

package com.crnts.List;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import arrays.Person;

public class AddPrimitiveDataToArrayList {
	Integer array[]= {1,4,2,2,2};
	List list=Arrays.asList(array);

	public static void main(String[] args) {
		AddPrimitiveDataToArrayList addPrimitiveDataToArrayList=new AddPrimitiveDataToArrayList();
		System.out.println("UsingForLoop()");
		addPrimitiveDataToArrayList.displayUsingForLoop();
		System.out.println();
		System.out.println("UsingForIterator()");
		addPrimitiveDataToArrayList.displayUsingIterator();
		System.out.println();
		addPrimitiveDataToArrayList.displayUsingForLoop1();
	}
	
	public void displayUsingIterator()
	{
		Iterator<Integer> listWithIterator=list.iterator();
		while(listWithIterator.hasNext())
		{
			System.out.print(listWithIterator.next()+" ");
		}
	
		
	}
	
	public void displayUsingForLoop()
	{
		for(int index=0;index<list.size();index++)
		{
			System.out.print(list.get(index)+" ");
		}
	}
	
	public void displayUsingForLoop1()
	{	Iterator<Integer> listWithIterator=list.iterator();
		for(;listWithIterator.hasNext();)
		{
			System.out.print("----"+listWithIterator.next()+" ");		}
	}
	}
		


