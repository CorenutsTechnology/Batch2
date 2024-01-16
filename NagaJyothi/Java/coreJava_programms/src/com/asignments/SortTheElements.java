package com.asignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortTheElements 
{
	public void sortTheElements(List<Employee>list)
	{
		list.add(new Employee(1,"Jyothi",30000.50));
		list.add(new Employee(2,"Puri",40000.50));
		list.add(new Employee(3,"Indu",35000.50));
		list.add(new Employee(4,"Richi",30000.50));
		list.add(new Employee(5,"Akshu",30000.50));
       Employee emp=new Employee();
        Collections.sort(list, emp);
		Iterator<Employee> iterator =list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		SortTheElements sort=new SortTheElements();
		sort.sortTheElements(list);
		
	}

}
