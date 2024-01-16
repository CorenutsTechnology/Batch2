package com.asignments;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;



public class ListElements {
	public void ArrayListElements(List<Employee> emp) {
		emp.add(new Employee(1, "Jyothi", 30000.50));
		emp.add(new Employee(2, "Puri", 40000.50));
		emp.add(new Employee(3, "Indu", 35000.50));
		emp.add(new Employee(4, "Raji", 30000.50));
		Iterator<Employee> iterator = emp.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		ListIterator<Employee>  listIterator=emp.listIterator();
		

		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		System.out.println("Previous elemnts");
		//ListIterator<Employee> iterator1 = emp.listIterator(emp.size());
		
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

	}

	public void LinkedListElements(List<Employee> emp) {
		emp.add(new Employee(1, "Jyothi", 30000.50));
		emp.add(new Employee(2, "Puri", 40000.50));
		emp.add(new Employee(3, "Indu", 35000.50));
		emp.add(new Employee(4, "Raji", 30000.50));
		Iterator<Employee> iterator = emp.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

	public void vectorelements(Vector<Employee> emp) {
		emp.add(new Employee(1, "Jyothi", 30000.50));
		emp.add(new Employee(2, "Puri", 40000.50));
		emp.add(new Employee(3, "Indu", 35000.50));
		emp.add(new Employee(4, "Raji", 30000.50));
		Enumeration<Employee> enumeration = emp.elements();
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());

		}

	}

	public static void main(String[] args) {
		ListElements elements = new ListElements();
		List<Employee> list = new ArrayList<>();
		elements.ArrayListElements(list);
		List<Employee> linkedList = new LinkedList<>();
		//elements.LinkedListElements(linkedList);
		Vector<Employee> vector = new Vector<>();
		//elements.vectorelements(vector);

	}

}
