package com.asignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class EmployeeObjectAsAKey 
{
	public static void main(String[] args) 
	{
		Map<Employee, String> map=new HashMap<>();
		map.put(new Employee(1,"Jyothi",30000.50),"F");
		map.put(new Employee(2,"Puri",40000.50),"F");
		map.put(new Employee(3,"Indu",35000.50),"F");
		map.put(null, "F");
		map.put(new Employee(4,"Supriya",30000.50), null);
		for(Entry<Employee, String> entry:map.entrySet())
		{
			System.out.println(entry);
			
		}
		
		
	}

}
