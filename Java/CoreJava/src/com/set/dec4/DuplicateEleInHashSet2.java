//2. Write a program to add duplicate elements to a hashset object and confirm what exception will throw?
package com.set.dec4;

import java.util.HashSet;
import java.util.Set;

public class DuplicateEleInHashSet2 
{
	public static void main(String[] args) 
	{
		Set set = new HashSet();
		//set will allow duplicate elements, but it won't override the existing value with new value, and 
		//it won't throw any exception
		
		set.add(10);
		set.add(20);
		set.add(17.6);
		set.add(10);
		set.add(30);
		for(Object obj : set)
		{
			System.out.println(obj);
		}
	}
}
