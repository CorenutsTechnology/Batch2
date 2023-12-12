package com.crnuts.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.crnuts.classes.Employee;

public class EmpMaxMinSal_Test_Ques5 {

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();

		emp.add(new Employee(1, "Manish", 22, "Male", 4000));
		emp.add(new Employee(2, "Shreya", 21, "Female", 78940));
		emp.add(new Employee(3, "Tara", 21, "Female", 6784));
		emp.add(new Employee(4, "Jeetu", 22, "Male", 17645));
		emp.add(new Employee(5, "Shejal", 22, "Female", 9874));

		Employee minSalEmp = emp.stream().min(Comparator.comparing(Employee::getSalary)).get();

		System.out.println(minSalEmp);

		System.out.println("Minimum salary emp details " + "\n" + minSalEmp);

		Employee maxSalEmp = emp.stream().max(Comparator.comparing(Employee::getSalary)).get();

		System.out.println("Maximum salary emp details" + "\n" + maxSalEmp);

		DoubleSummaryStatistics d = emp.stream().collect(Collectors.summarizingDouble(e -> e.getSalary()));

		System.out.println("Maximum salary: " + d.getMax());
		System.out.println("Minimum salary: " + d.getMin());

	}

}
