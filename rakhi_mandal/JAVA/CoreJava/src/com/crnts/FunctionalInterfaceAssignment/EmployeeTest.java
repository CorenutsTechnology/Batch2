package com.crnts.FunctionalInterfaceAssignment;

public class EmployeeTest  {

	public static void main(String[] args) {
		EmployeeInterface employeeInterface =Employee::new ;
		employeeInterface.display("rakhi");
	}


}
