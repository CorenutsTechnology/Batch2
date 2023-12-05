//1. Write a program to add primitive data type elements  to a hashset object and display the elements? 
//2. Write a program to add duplicate elements to a hashset object and confirm what exception will throw?
package com.crnts.List.Assignment;

import java.util.HashSet;
import java.util.Iterator;

public class PrimitiveToHashset {

	public static void main(String[] args) {
		PrimitiveToHashset primitiveToHashset=new PrimitiveToHashset();
		primitiveToHashset.displayHasSet();
	}
	
	public void displayHasSet()
	{
		HashSet<Integer> hasSet=new HashSet(); //sorts the inputs based on hash number   //accepts one null // no duplicates
		hasSet.add(20);
		hasSet.add(9);
		hasSet.add(7);
		hasSet.add(7); //if duplicates are added ,no exception only once it is started
		hasSet.add(77);
		hasSet.add(00);
		hasSet.add(8);
		hasSet.add(00);
		hasSet.add(null);
//		hasSet.add(null);
		
		Iterator<Integer> listWithIterator=hasSet.iterator();
		while(listWithIterator.hasNext())
		{
			System.out.println(listWithIterator.next()+" ");
		}
		
	}
	
	

}
