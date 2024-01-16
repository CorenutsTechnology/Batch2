package com.week9.assigenments;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDetails {
	
	
			public static void main(String[] args) {
			List<Employee> employeeList = new ArrayList<>();
			 
			employeeList.add(new Employee(1, "Ram", 32, "Male", "Development", 2011, 25000.0));
			employeeList.add(new Employee(2, "Puri", 25, "Female", "Marketing", 2015, 13500.0));
			employeeList.add(new Employee(3, "Murali", 29, "Male", "Sales", 2012, 18000.0));
			employeeList.add(new Employee(4, "Jyothi", 28, "Female", "Development", 2014, 34500.0));
			employeeList.add(new Employee(5, "Madhu", 27, "Female", "HR", 2013, 22700.0));
			employeeList.add(new Employee(6, "Srikanth", 43, "Male", "Accounts", 2016, 10500.0));
			employeeList.add(new Employee(7, "Chandu", 32, "Male", "Development", 2010, 27000.0));
			employeeList.add(new Employee(8, "Swathi", 31, "Female", "Development", 2015, 34500.0));
			employeeList.add(new Employee(9, "Raji", 24, "Female", "Marketing", 2016, 11500.0));
			employeeList.add(new Employee(10, "Arjun", 38, "Male", "Sales", 2015, 11000.5));
			
			
			//male and femaile employee in organization.
//			employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()))
//			.entrySet().forEach((e)->System.out.println(e.getKey()+" "+e.getValue()));
			
			//print the name of all the departments
//			employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment))
//			.entrySet().forEach(e->System.out.println(e.getKey()));
			//booleanoptional=employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))).isPresent();
			
			//get
//			employeeList.stream().filter(e->e.getYearOfJoining()>2015)
//			.collect(Collectors.toList()).forEach((e)->System.out.println(e.getName()));
//			
			
			//list down the employee names in each department
			
//			employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment))
//			.entrySet().forEach(e->{
//				System.out.println(e.getKey());
//				e.getValue().forEach(e1->{System.out.println(e1.getName());});});
//			
			//how many male and femaile employee in sales and marketing department
			
//			employeeList.stream().filter((e)->e.getDepartment().equalsIgnoreCase("Sales")||e.getDepartment().equalsIgnoreCase("Marketing"))
//			.collect(Collectors.groupingBy(Employee::getGender)).entrySet()
//			.forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
//			
//			employeeList.stream().filter(e->e.getDepartment().equalsIgnoreCase("sales")||e.getDepartment().equalsIgnoreCase("Marketing"))
//			.collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()))
//			.entrySet().forEach(e->System.out.println(e.getKey()+""+e.getValue()));
//			
//			employeeList.stream().filter(e->e.getDepartment().equalsIgnoreCase("sales")||e.getDepartment().equalsIgnoreCase("Marketing"))
//			.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.groupingBy(Employee::getGender,Collectors.counting()))).entrySet()
//			.forEach(e->{System.out.println(e.getKey());
//			e.getValue().entrySet().forEach(e1->{System.out.println(e1.getKey()+""+e1.getValue());});});
//			
			
			//heighest paid employeee
			Optional<Employee> optional=employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
			System.out.println(optional.get());
			
			
//			Optional<Employee>op=employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst();
//			System.out.println(op);
//			Optional<Employee>op=employeeList.stream().filter(e->e.getDepartment().equalsIgnoreCase("development")&& e.getGender().equalsIgnoreCase("Male"))
//			.sorted(Comparator.comparing(Employee::getAge)).findFirst();
//			System.out.println(op);
//			
			
//			employeeList.stream().map(Employee::getName).filter(e->e.startsWith("J")).collect(Collectors.toList()).forEach(e->System.out.println(e));
//			
//			employeeList.stream().sorted(Comparator.comparing(Employee::getAge)).findFirst();
//			employeeList.stream().collect(Collectors.groupingBy(Employee::getName)).entrySet().forEach(e->System.out.println(e.getKey()));
//			 Map<Integer, List<Employee>> o=employeeList.stream().collect(Collectors.groupingBy(Employee::getAge));
//		     o.entrySet().forEach(e->{System.out.println(e.getKey());
//		    e.getValue().sort(Comparator.comparing(Employee::getSalary).reversed());	 
//		     });	 
			 //System.out.println(o);
//			Map<Integer, Map<Double, List<Employee>>> m= employeeList.stream().collect(Collectors.groupingBy(Employee::getAge,Collectors.groupingBy(Employee::getSalary)));
//			m.entrySet().forEach(e->System.out.println(e.getKey()+""+e.getValue()));
//			 	
		}

	}



