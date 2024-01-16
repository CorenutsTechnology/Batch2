package com.asignments;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class iteratorAndEnumerator 
{
	public void display(List<Employee> emp)
	{
		emp.add(new Employee(1,"Jyothi",30000.50));
		emp.add(new Employee(2,"Puri",40000.50));
		emp.add(new Employee(3,"Indu",35000.50));
		emp.add(new Employee(4,"Raji",30000.50));
		Iterator<Employee> iterator=emp.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			iterator.remove();
		}
		
	}
	public void elements(Vector<Employee> emp)
	{
		emp.add(new Employee(1,"Jyothi",30000.50));
		emp.add(new Employee(2,"Puri",40000.50));
		emp.add(new Employee(3,"Indu",35000.50));
		emp.add(new Employee(4,"Raji",30000.50));
		Enumeration<Employee> enumeration=emp.elements();
		while(enumeration.hasMoreElements())
		{
			System.out.println(enumeration.nextElement());
		
			
		}

		
	}
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		iteratorAndEnumerator result=new iteratorAndEnumerator();
		result.display(list);
		Vector<Employee> vector=new Vector<>();
		//result.elements(vector);
		
	}

}
