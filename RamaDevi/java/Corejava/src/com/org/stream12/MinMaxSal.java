package com.org.stream12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinMaxSal {

	public static void main(String[] args) {
		List<Employee>  empsal=new ArrayList<>();
		empsal.add(new Employee(1,"hari",390762.0));
		empsal.add(new Employee(2,"dhani",620762.0));
		empsal.add(new Employee(4,"apri",762.0));
		empsal.add(new Employee(3,"mithai",90762.0));
		
		//System.out.println(empsal.stream().map(e->e.getSalary()).collect(Collectors.summarizingDouble(e->e)));
		Comparator<? super Employee> comparator=Comparator.comparing( Employee::getSalary );
		Employee empvalue=empsal.stream().max(comparator).get();
		System.out.println(empvalue);
		Employee empvalue1=empsal.stream().min(comparator).get();
		System.out.println(empvalue1);

	}

}
