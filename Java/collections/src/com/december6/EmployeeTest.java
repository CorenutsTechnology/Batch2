package com.december6;
import java.util.*;
public class EmployeeTest 
{
	public void test()
	
	{
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(101,"Ram",25000.0,"male"));
		list.add(new Employee(102,"Raj",35000.0,"male"));
		list.add(new Employee(101,"Ram",25000.0,"male"));
		list.add(new Employee(103,"Seetha",45000.0,"female"));
		list.add(new Employee(104,"Rajini",55000.0,"female"));
		
		Set<Employee> set = new HashSet<>();
		set.add(new Employee(101,"Ram",25000.0,"male"));
		set.add(new Employee(102,"Raj",35000.0,"male"));
		set.add(new Employee(101,"Ram",25000.0,"male"));
		set.add(new Employee(103,"Seetha",45000.0,"female"));
		set.add(new Employee(104,"Rajini",55000.0,"female"));
		
//		Collections.sort(list);
		
		
		
		Collections.sort(list,new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		
		Iterator<Employee> iterator = list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
		
	}
	public static void main(String[] args) {
		new EmployeeTest().test();
	}
}
