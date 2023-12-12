//Create a list of employees and print all records using streams?
package com.crnts.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrintEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintEmployee printEmployee =new PrintEmployee();
		printEmployee.display();

	}

	public void display() {
		// stream() is not supporting Maps
		List<Employee> details = new ArrayList<>();
		details.add(new Employee("Developer", "Tom", 7877.7));
		details.add(new Employee("Tester", "Jack", 78708.8));
		details.add(new Employee("Tester", "adi", 700.0));
		details.stream().forEach((e)->System.out.println(e));


	}

}
