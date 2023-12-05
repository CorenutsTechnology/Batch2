//4.Write a program to add primitive data type elements (duplicates) to a set object and display the elements in Sort order?

package com.crnts.List.Assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrimitiveSetSort {
	
	public static void main(String[] args) {
		PrimitiveSetSort primitiveSetSort =new PrimitiveSetSort();
		System.out.println("--------Using TreeSet------------------");
		primitiveSetSort.treeSet();
		System.out.println("--------Using HasSet------------------");
		primitiveSetSort.displayHasSet();
	}

	public void treeSet()
	{
		TreeSet<Integer> set=new TreeSet<>(); //sorts the inputs   //accepts one null // no duplicates
		set.add(20);
		set.add(9);
		set.add(7);
		set.add(7); //if duplicates are added ,no exception only once it is started
		set.add(77);
		set.add(00);
		set.add(8);
		set.add(00);
//		set.add(null);  
//		hasSet.add(null);
		
		Iterator<Integer> listWithIterator=set.iterator();
		while(listWithIterator.hasNext())
		{
			System.out.println(listWithIterator.next()+" ");
		}
		
	}
	
	public void displayHasSet()
	{
	 
		HashSet<Double> hasSet=new HashSet(); //sorts the inputs based on hash number   //accepts one null // no duplicates
		hasSet.add(88.7);
		hasSet.add(5.5);
		hasSet.add(9.0);
		hasSet.add(99.9);
		hasSet.add(34.2);
		hasSet.add(9.0);
		hasSet.add(99.9);
		hasSet.add(34.2);
		hasSet.add(99.3);
		
		Set<Double> array=new TreeSet<>(hasSet);
		
		Iterator<Double> listWithIterator=array.iterator();
		while(listWithIterator.hasNext())
		{
			System.out.println(listWithIterator.next()+" ");
		}
//		System.out.println(array);
		
		
		
	}

}

