//6. Write a program to show the difference between HashSet and TreeSet?
package com.crnts.List.Assignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetVsTreeSet {
	public static void main(String[] args) {
		HashSetVsTreeSet compareThem =new HashSetVsTreeSet();
		System.out.println("--------Using TreeSet------------------");
		compareThem.treeSet(); //sorts by default 
		System.out.println("--------Using HasSet------------------");
		compareThem.hasSet();//need to sort
	}


public void treeSet()
{
	TreeSet<Integer> set=new TreeSet<>(); //sorts the inputs   //accepts one null // no duplicates
	set.add(20);
	set.add(9);
	set.add(7);
	set.add(7); //if duplicates are added ,no exception 
	set.add(77);
	set.add(00);
	set.add(8);
	set.add(00);
//	set.add(null);   //do not accepts null
//	hasSet.add(null);
	System.out.println(java.time.LocalTime.now());
	Iterator<Integer> listWithIterator=set.iterator();
	while(listWithIterator.hasNext())
	{
		System.out.println(listWithIterator.next()+" ");
	}
	System.out.println(java.time.LocalTime.now());
		
}

public void hasSet()
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
//	hasSet.add(null);  //null not accepted
	
	Set<Double> array=new TreeSet<>(hasSet);
	
	Iterator<Double> listWithIterator=array.iterator();
	System.out.println(java.time.LocalTime.now());
	while(listWithIterator.hasNext())
	{
		System.out.println(listWithIterator.next()+" ");
	}
	System.out.println(java.time.LocalTime.now());
	
	

//	System.out.println(array);
	
	
	
}

}
