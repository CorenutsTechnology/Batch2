package com.feuji4dec;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AddElementsHashSet
{
	public void addEleents(Set<String> set)
	{
		set.add("Jyothi");
		set.add("indu");
		set.add("puri");
		set.add("Jyothi");
		set.add(null);
		set.add(null);
		Iterator<String> iterator=set.iterator();
		   while(iterator.hasNext())
		   {
			   System.out.println(iterator.next());
		   }
	}
	public void addObjects(Set<Student> set)
	{
		set.add(new Student(20,"Jyothi"));
		set.add(new Student(23,"Puri"));
		set.add(new Student(22,"Indu"));
		set.add(new Student(24,"Richi"));
		set.add(new Student(21,"Jyothi"));
		System.out.println(set);
	}
    public static void main(String[] args) 
    {
	   Set<String> set=new HashSet<>();
    	AddElementsHashSet elements=new AddElementsHashSet();
    	elements.addEleents(set);
    	//AddElementsHashSet elements=new AddElementsHashSet();
    	NameComparator d=new NameComparator();
    	
    	
    	 Set<Student> student=new TreeSet<>(d);
    	elements.addObjects(student);
	   
	   
	 
    }
}
