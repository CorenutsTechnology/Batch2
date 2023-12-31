//6. Write program sort the Employee elements based on name or location from ArrayList
package com.december5;
import java.util.*;
public class Program6 
{
	public void method()
	{
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(123,"pavan",80000.0));
		list.add(new Employee(124,"raju",60000.00));
		list.add(new Employee(125,"karam",50000.0));
		list.add(new Employee(126,"mukesh",70000.0));
		list.add(new Employee(122,"javid",56000.0));
		
		TreeSet<Employee> set2 = new TreeSet<>(new ComparatorSalary());
		set2.addAll(list);
		System.out.println("sorting based on salary\n"+set2);
		TreeSet<Employee> set = new TreeSet<>(new ComparatorName());
		set.addAll(list);
//		for(Employee emp:list)
//		{
//			set.add(emp);
//		}
		
		System.out.println("sorting based on name\n"+set);
//		TreeSet<Employee> set = new TreeSet<>(list);
		
	}
//	public static void main(String[] args) {
//		new Program6().method();
//	}
}
