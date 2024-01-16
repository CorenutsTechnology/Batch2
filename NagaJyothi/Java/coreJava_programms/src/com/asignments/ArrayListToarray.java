package com.asignments;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToarray 
{
	public void convert(List<Employee> list)
	{
		list.add(new Employee(1,"Jyothi",30000.50));
		list.add(new Employee(2,"raji",35000.50));
		list.add(new Employee(3,"swathi",35000.50));
		
		Employee[] array=new Employee[list.size()];
		for(int index=0;index<list.size();index++)
		{
			//System.out.println(list.get(index)); 
			array[index]=list.get(index);
		}
		System.out.println("Array Elements");
		for(int index=0;index<=array.length-1;index++)
		{
			System.out.println(array[index]);
		}
	}
	public static void main(String[] args) {
		ArrayListToarray result=new ArrayListToarray();
		List<Employee> list=new ArrayList<>();
		result.convert(list);
		
	}

}
