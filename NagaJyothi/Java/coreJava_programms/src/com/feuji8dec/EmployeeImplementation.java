package com.feuji8dec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Function;

public class EmployeeImplementation {
	public void displayDetails(Set<Employee> emp) {
		emp.add(new Employee(1, "jyothi", 30000.0));
		emp.add(new Employee(2, "indu", 35000.0));
		emp.add(new Employee(3, "puri", 40000.0));
		Iterator<Employee> iterator = emp.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public static void main(String[] args) {
//		TreeSet<Employee> set=new TreeSet<>();
//		EmployeeImplementation result=new EmployeeImplementation();
//		result.displayDetails(set);
//		Comparator<Employee>comparator=(e1, e2)->
//		{
//			Employee emp1=(Employee)e1;
//			Employee emp2=(Employee)e2;
//			return emp1.getEname().compareTo(emp2.getEname());
//			
//			
//		};

		List<Employee> e1 = new ArrayList<>();
		e1.add(new Employee(1, "jyothi", 30000.0));
		e1.add(new Employee(2, "indu", 35000.0));
		e1.add(new Employee(3, "puri", 40000.0));
		Comparator<Employee> comparator = (e2, e3) -> {
			Employee emp1 = (Employee) e2;
			Employee emp2 = (Employee) e3;
			return emp1.getEname().compareTo(emp2.getEname());
		};
		Collections.sort(e1, comparator);
		for (Employee e : e1) {
			System.out.println(e);
		}
		TreeSet<Employee> treeset = new TreeSet<>(comparator);
		treeset.add(new Employee(1, "Z", 30000.0));
		treeset.add(new Employee(2, "D", 35000.0));
		treeset.add(new Employee(3, "A", 40000.0));
		for (Employee emp : treeset) {
			System.out.println(emp);
		}

		TreeMap<Employee, Integer> map = new TreeMap<>((e3, e2) -> {
			Employee emp1 = (Employee) e3;
			Employee emp2 = (Employee) e2;
			return emp1.getSal()>(emp2.getSal())?1:-1;
		});
		map.put(new Employee(1, "Latha", 30000.0), 1);
		map.put(new Employee(1, "Raji", 30000.0), 2);
		map.put(new Employee(1, "Sri Latha", 30000.0), 3);
		for (Entry<Employee, Integer> emp : map.entrySet()) {
			System.out.println(emp);
		}

	}
}
