package com.feuji12dec;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeTest 
{
	public static void main(String[] args) 
	{
		// filter records where sal is greater than 50000
		List<Employee> emp=new ArrayList<>();
		emp.add(new Employee(1,"jyothi",55000.0));
		emp.add(new Employee(2,"puri",45000.0));
		emp.add(new Employee(3,"indu",35000.0));
		emp.add(new Employee(4,"richi",30000.0));
		emp.add(new Employee(5,"supriya",30000.0));
		emp.add(new Employee(6,"padmalatha",35000.0));
		emp.add(new Employee(5,"raji",35000.0));
		System.out.println(emp.stream().mapToDouble(Employee::getEmpSal).sum());
		//to display the all the records
		Stream<Employee> s=emp.stream();
		//s.forEach((e)->System.out.println(e));
		/*
		 * we will get run time exception as illegalStateException becoz
		 * after completion of one operation on streams jvm close the  session if we try 
		 * to perform another operation on streams we will get run time exception.
		 */
//		 Stream<Employee> b=s.filter((e)->e.equals("jyothi"));
//		 System.out.println(b);
		
//		long num=emp.stream().count();
//		System.out.println(num);
		//emp.stream().collect(Collectors.toList()).forEach((e)->System.out.println(e));
		System.out.println("---------");
		
		// display the records who are having salaray greater than 50000
//		emp.stream().filter((e)->e.getEmpSal()<50000).collect(Collectors.toList())
//		.forEach((e1)->System.out.println(e1));
		
//		 display the records in assending order based on names.
//		System.out.println("------------------");
//		emp.stream().sorted(Comparator.comparing(Employee::getEmpName))
//		.filter((e)->e.getEmpSal()<50000).collect(Collectors.toList()).forEach((e)->System.out.println(e));
//		
		//find maximu salary
//		DoubleSummaryStatistics res=emp.stream().collect(Collectors.summarizingDouble(Employee::getEmpSal));
//		System.out.println("maximum salay : "+res.getMax());
//		System.out.println("minimum salay: "+res.getMin());
//		System.out.println("Count:"+res.getCount());
		List list=emp.stream().sorted(Comparator.comparing(Employee::getEmpSal)).collect(Collectors.toList());
		System.out.println(list.get(0));
		list.stream().sorted().forEach((e)->System.out.println(e));
		
		
		
		
		
		
	}

}
