package com.asignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentElementsIntoList 
{
	public void elemnts(List<Student> student)
	{
		student.add( new Student(101,"Jyothi",24,"Cse"));
		student.add( new Student(102,"Indu",23,"Cse"));
		student.add( new Student(103,"Puri",22,"Cse"));
		student.add( new Student(104,"raji",23,"Ece"));
		for(int index=0;index<=student.size()-1;index++)
		{
			System.out.println(student.get(index));
		}
		Iterator<Student> iterator=student.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		StudentElementsIntoList elements=new StudentElementsIntoList();
		elements.elemnts(list);
		
	}

}
