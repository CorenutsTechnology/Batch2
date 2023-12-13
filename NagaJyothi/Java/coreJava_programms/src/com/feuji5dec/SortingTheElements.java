package com.feuji5dec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class SortingTheElements 
{
	//sort the elements based name...in ArrayList
	public void sort(List<Employee>list)
	{
		list.add(new Employee(1, "Jyothi", 40000, "JavaDeveloper"));
		list.add(new Employee(2, "Indu", 35000, "PythonDeveloper"));
		list.add(new Employee(3, "Puri", 40000, "ASE"));
		list.add(new Employee(4, "Richitha", 25000, "ASE"));
		list.add(new Employee(5, "Supriya", 30000, "QA Analyst"));
		System.out.println(list);
		Collections.sort(list);
		ListIterator<Employee> iterator=list.listIterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	public static void main(String[] args) {
		SortingTheElements elements=new SortingTheElements();
		List<Employee> list=new ArrayList<>();
		elements.sort(list);
	}

}
