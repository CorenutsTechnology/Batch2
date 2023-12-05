package com.feuji_08;

import com.employee_08.Employee;

public class EmployeeArray {
	
	public Employee[] createEmployeeArray() {
		Employee[] employeeArray = new Employee[4];
		Employee employee1= new Employee();
		employee1.setName("Swathi");
		employee1.setId(1);
		employee1.setSalary(20000.00);
		employeeArray[0]=employee1;
		
		
		Employee employee2 = new Employee();
		employee2.setName("Bindhu");
		employee2.setId(2);
		employee2.setSalary(30000.00);
		employeeArray[1]=employee2;
		
		Employee employee3 = new Employee();
		employee3.setName("Navya");
		employee3.setId(3);
		employee3.setSalary(40000.00);
		employeeArray[2]=employee3;
		
		Employee employee4 = new Employee();
		employee4.setName("Keerthi");
		employee4.setId(4);
		employee4.setSalary(50000.00);
		employeeArray[3]=employee4;
		
		return employeeArray;
		
	}
	
	public static void main(String[] args) {
		
		EmployeeArray empArray= new EmployeeArray();
		Employee employee[] = empArray.createEmployeeArray();
		System.out.println(employee);
		
		System.out.println(employee[0]);
		System.out.println(employee[1]);
		System.out.println(employee[2]);
		
		
		
		
		
	}

}
