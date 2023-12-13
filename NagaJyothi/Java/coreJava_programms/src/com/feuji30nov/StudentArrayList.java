package com.feuji30nov;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentArrayList 
{
	public <T>void addDetails()
	{
		List <Student>list=new ArrayList<>();
		list.add(new Student(1,"Jyothi",20,"hyd"));
		list.add(new Student(2,"indu",22,"Guntur"));
		Iterator< Student> iterator=list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	public static void main(String[] args) 
	{
		StudentArrayList student=new StudentArrayList();
		
		student.addDetails();
		StringBuilder builder=new StringBuilder("Hello");
	       //builder.append(null);
	       System.out.println(builder);
	       
		
	}

}
