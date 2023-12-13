package com.feuji11dec;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.feuji5dec.Employee;

public class Sort 
{
	public List<Employee> sort(List<Employee>emp)
	{
		emp.add(new Employee(1, "Jyothi", 40000, "JavaDeveloper"));
		emp.add(new Employee(2, "Indu", 35000, "PythonDeveloper"));
		emp.add(new Employee(3, "Puri", 40000, "ASE"));
		emp.add(new Employee(4, "Richitha", 25000, "ASE"));
		emp.add(new Employee(1, "Supriya", 30000, "QA Analyst"));
		return emp;
	}
     public static void main(String[] args)
     {
    	 Sort sort=new Sort();
    	 List<Employee> emp=new ArrayList<>();
    	List<Employee> list=sort.sort(emp);
    	list.stream().sorted().forEach((e)->System.out.println(e));
    	System.out.println("---------------");
    	list.stream().filter((e)->e.getEmpId()==1).sorted().forEach((e)->System.out.println(e));
    	System.out.println("---------------");
       List<Employee> res= list.stream().filter((e)->e.getEmpName().equals(
		   "Jyothi")).collect(Collectors.toList());
          res.forEach((e)->System.out.println(e));
    	 
		
	}
}
