//Write a program to add all elements of a list to array List and get
//sub list from a List?
package com.crnts.List.Assignment;

import java.util.ArrayList;

public class SublistFromArrayList {

	public static void main(String[] args) {
		SublistFromArrayList sublistFromArrayList=new SublistFromArrayList();
		sublistFromArrayList.displayList();
	}
	
	public void displayList()
	{
		ArrayList array =new ArrayList();
		array.add("rakhi");
		array.add("sweta");
		array.add("joe");
		array.add("abhi");
		array.add("zack");
		array.add("joe");
		array.add("abhi");
		array.add("zack");
		System.out.println(array);
		
		ArrayList subarray =new ArrayList(array.subList(2, 6));
		System.out.println(subarray);
		
	}

}
