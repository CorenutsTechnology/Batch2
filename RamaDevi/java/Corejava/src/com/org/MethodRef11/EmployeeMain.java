package com.org.MethodRef11;

import java.util.function.Supplier;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp=new Employee("hari");
		Supplier<Employee> sup=Employee::new;
		sup.get();
	}

}
