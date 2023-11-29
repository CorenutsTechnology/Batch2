package com.crnuts.genericsTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//------------generics gives compile time type check.-----------------

import com.crnuts.genericClass.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		ArrayList arrayList=new ArrayList();
		arrayList.add(45);
		arrayList.add("shreya");
		arrayList.add('a');
		arrayList.add(true);
		
	//	int value=(int)arrayList.get(1);// runtime exception, ClassCastException
	//	System.out.println(value);
		
	
		
		Employee employee1 = new Employee("Shreya", 443, 5463433);
		Employee employee2 = new Employee("Manish", 453, 4532345);
		Employee employee3 = new Employee("Ayushi", 332, 342345);
		Employee employee4 = new Employee("Shreya", 431, 653524);

		List<Employee> list = new ArrayList<>();

//********* QUES 1 *********
		// employees.add(5); // The method add( Employee) in the type List<Employee>
		// is not applicable for the arguments (int)
		

		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		
		for (int index = 0; index < list.size(); index++) {
			System.out.println(list.get(index));
		}
		HashSet<Employee> hashSet = new HashSet<>();

		hashSet.add(employee1);
		hashSet.add(employee2);
		hashSet.add(employee3);
		hashSet.add(employee4);
		System.out.println(hashSet.hashCode());
		
		
	}

}
