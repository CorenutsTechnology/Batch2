package com.org.stream12;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpSal {

	public static void main(String[] args) {
		List<Employee>  empsal=new ArrayList<>();
		empsal.add(new Employee(1,"hari",390762.0));
		empsal.add(new Employee(2,"dhani",620762.0));
		empsal.add(new Employee(1,"apri",762.0));
		empsal.add(new Employee(1,"mithai",90762.0));
		empsal.stream().filter((e)->e.getSalary()>=10000).collect(Collectors.toList()).forEach(e->System.out.println(e));
				
		
	}

}
