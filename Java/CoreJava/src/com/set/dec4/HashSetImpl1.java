//1. Write a program to add primitive data type elements  to a hashset object and display the elements? 
package com.set.dec4;
import java.util.HashSet;
import java.util.Set;
public class HashSetImpl1 {

	public static void main(String[] args) {
		Set set = new HashSet();		
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
