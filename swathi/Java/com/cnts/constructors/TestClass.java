package com.cnts.constructors;

import org.junit.jupiter.api.Test;

public class TestClass {
	
	@Test
	public void displayEmployeeDetails() {
	Employee employee=new Employee("keerthi",22,108);
		System.out.println(employee);
		employee.display();
		
		
		
	StudentRegistrationForm studentRegistrationForm = new StudentRegistrationForm("swathi",9900838259l,"Bangalore city college");
		
	System.out.println(studentRegistrationForm);
	
	StudentRegistrationForm studentRegistrationForm1 = new StudentRegistrationForm("swathi",9900838259l);
	System.out.println(studentRegistrationForm1);
	
	}
	
	

}
