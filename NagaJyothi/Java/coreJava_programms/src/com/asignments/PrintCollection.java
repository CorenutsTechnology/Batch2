package com.asignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrintCollection 
{
	public void  print(List<Employee> list)
	{
		list.add(new Employee(1,"Jyothi",3000.50));
		list.add(new Employee(2,"puri",4000.50));
		list.add(new Employee(3,"indu",3500.50));
		list.add(new Employee(4,"Raji",3000.50));
		Iterator<Employee> iterator=list.iterator();
		for(int i=0;i<=list.size()-1;i++)
		{
		  System.out.println(list.get(i));	
		}	
		for(Employee emp:list)
		{
			System.out.println(emp);
		}
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
//		
	}
	public static void main(String[] args) 
	{
		PrintCollection printCollection=new PrintCollection();
		List<Employee> list=new ArrayList<>();
		printCollection.print(list);
		
		
	}

}
