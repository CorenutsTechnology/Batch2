package com.asignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class AdvantageOfListAndSet {
	public void setElementss(Set<Student> student) {
		student.add(new Student(101, "Jyothi", 24, "Cse"));
		student.add(new Student(102, "Indu", 23, "Cse"));
		student.add(new Student(103, "Puri", 22, "Cse"));
		student.add(new Student(104, "raji", 23, "Ece"));
		student.add(new Student(103, "Puri", 22, "Cse"));
		student.add(null);
		student.add(null);
		Iterator<Student> iterator = student.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	public void elemnts(List<Student> list)
	{
		list.add( new Student(101,"Jyothi",24,"Cse"));
		list.add( new Student(102,"Indu",23,"Cse"));
		list.add( new Student(103,"Puri",22,"Cse"));
		list.add( new Student(104,"raji",23,"Ece"));
		list.add(null);
		list.add(null);
		Iterator<Student> iterator=list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		Set<Student> set=new HashSet<>();
		AdvantageOfListAndSet result=new AdvantageOfListAndSet();
		result.elemnts(list);
		System.out.println("-----");
		result.setElementss(set);
		
	}
}
