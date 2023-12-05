package com.crnts.List.Assignment;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HasSetVsLinkedHasSet {
	public static void main(String[] args) {
		HasSetVsLinkedHasSet hasSetVsLinkedHashSet=new HasSetVsLinkedHasSet();
		hasSetVsLinkedHashSet.hasSet();// do not obeys insertion order
		hasSetVsLinkedHashSet.linkedHasSet(); // obeys insertion order
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
//		hasSet.add(null);  //null not accepted
		
//		Set<Double> array=new TreeSet<>(hasSet);
		
		Iterator<Double> listWithIterator=hasSet.iterator();
		System.out.println(java.time.LocalTime.now());
		while(listWithIterator.hasNext())
		{
			System.out.println(listWithIterator.next()+" ");
		}
		System.out.println(java.time.LocalTime.now());
	}
		
		
public void linkedHasSet(){
	LinkedHashSet<String> linkHasSet= new LinkedHashSet<>();  //one null allowed //no duplicates
	linkHasSet.add("Zack");
	linkHasSet.add("Rakhi");
	linkHasSet.add("vaishali");
	linkHasSet.add("shivani");
	linkHasSet.add("kalyani");
	linkHasSet.add("jack");
	linkHasSet.add("kalyani");
	linkHasSet.add("jack");
	linkHasSet.add(null);
	linkHasSet.add(null);
//	Collections.sort(linkHasSet);
	
	System.out.println(linkHasSet);
}
}