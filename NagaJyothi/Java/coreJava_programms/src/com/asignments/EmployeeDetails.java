package com.asignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EmployeeDetails 
{
	public void displayDetails(Set<Employee> emp)
	{
		emp.add(new Employee(1,"Jyothi",30000.50));
		emp.add(new Employee(2,"Puri",40000.50));
		emp.add(new Employee(3,"Indu",35000.50));
		emp.add(new Employee(4,"Raji",30000.50));
		emp.add(new Employee(3,"Indu",35000.50));
		emp.add(new Employee(1,"Jyothi",30000.50));
		//emp.add(new Employee(3,"Indu",35000.50));
		Iterator<Employee> iterator=emp.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
    public static void main(String[] args) 
    {
    	EmployeeDetails result=new EmployeeDetails();
    	Set<Employee> set=new HashSet<>();
    	result.displayDetails(set);
		
	}
}
