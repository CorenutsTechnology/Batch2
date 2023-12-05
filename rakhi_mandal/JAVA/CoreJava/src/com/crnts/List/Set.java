package com.crnts.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import arrays.Person;

public class Set {

	public static void main(String[] args) {
		
		Set set=new Set();
//		set.displayTreeSet();
		set.displayTreeSet1();
//		-----------------------------------
//		set.displayHasSet();
//		set.displayHasSet1();
//		-----------------------------------
//		set.displayHashTree();
	}
	
	public void displayTreeSet()
	{
		TreeSet<String> names =new TreeSet<>();    //sorts the inputs   //no null // no duplicates
		names.add("Rakhi");
		names.add("Monika");
		names.add("vaishali");
		names.add("shivani");
		names.add("kalyani");
		names.add("jack");
		names.add("kalyani");
		names.add("jack");
//		names.add(null);
//		names.add(null);
		
		Iterator<String> listWithIterator=names.iterator();
		while(listWithIterator.hasNext())
		{
			System.out.println(listWithIterator.next()+" ");
		}
	}
	
	public void displayTreeSet1()
	{
		TreeSet<Student> names =new TreeSet<>();    //sorts the inputs based on compareTo method in Student class
		names.add(new Student(16,"Jack","JAVA"));
		names.add(new Student(1,"Rakhi","CBSE"));
		names.add(new Student(6,"Jerry","CBSE"));
		names.add(new Student(12,"Tom","ICSE"));
		names.add(new Student(1,"Jakie","ICSE"));
		
		Iterator<Student> listWithIterator=names.iterator();
		while(listWithIterator.hasNext())
		{
			System.out.println(listWithIterator.next()+" ");
		}
	}
	

	public void displayHasSet()
	{
		HashSet<String> hasSet=new HashSet(); //sorts the inputs based on hash number   //accepts one null // no duplicates
		hasSet.add("Zack");
		hasSet.add("Rakhi");
		hasSet.add("Monika");
		hasSet.add("vaishali");
		hasSet.add("shivani");
		hasSet.add("kalyani");
		hasSet.add("jack");
		hasSet.add("kalyani");
		hasSet.add("jack");
		hasSet.add(null);
//		hasSet.add(null);
		
		Iterator<String> listWithIterator=hasSet.iterator();
		while(listWithIterator.hasNext())
		{
			System.out.println(listWithIterator.next()+" ");
		}
		
	}
	
	public void displayHasSet1()
	{
		HashSet<Student> hasSet=new HashSet(); //sorts the inputs based on compareTo method in Student class
		hasSet.add(new Student(1,"Rakhi","CBSE"));
		hasSet.add(new Student(12,"Tom","ICSE"));
		hasSet.add(new Student(6,"Jerry","CBSE"));
		
		Iterator<Student> listWithIterator=hasSet.iterator();
		while(listWithIterator.hasNext())
		{
			System.out.println(listWithIterator.next()+" ");
		}
	}
	public void displayHashTree()
	{
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
//		Collections.sort(linkHasSet);
		
		System.out.println(linkHasSet);
		
//		HashSet<String> hash_set = new HashSet<>(linkHasSet);
//		System.out.println(hash_set);
		
		
		

//		Iterator<String> listWithIterator=array.iterator();
//		while(listWithIterator.hasNext())
//		{
//			System.out.println(listWithIterator.next()+" ");
//		}
	}
	}


