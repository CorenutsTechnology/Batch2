package com.crnuts.test;

import com.crnuts.interfaces.Company;
import com.crnuts.impleClass.Address;
import com.crnuts.impleClass.Employee;

public class CompanyTest {

	public static void main(String[] args) {

		Employee employee = new Employee(123, "Shreya Gupta", 8529499675L, "1352XXC54", "#43", "JP naagr", "Bengaluru",
				"Karnataka", 560076);

		employee.employeeDetails();
		employee.addressOfEmployee("#43", "JP naagr", "Bengaluru", "Karnataka", 560076);

		employee.logIn(employee.getEid());

	}
}
