package com.crnt.nov0823;

import com.crnt.nov07231.Employee;

public class EmployeeArray {
	public static void main(String[] args) {
		EmployeeArray emp = new EmployeeArray();
		Employee [] employees=emp.creatempArray();
		System.out.println(employees.length);
		//System.out.println(emp.creatempArray());
		//emp.creatempArray();
		System.out.println(employees[0]);
		System.out.println(employees[1]);
		System.out.println(employees[2]);
		System.out.println(employees[3]);
	}

	private Employee[] creatempArray() {
		Employee [] empArray= new Employee[4];
		Employee emp1 = new Employee();
		emp1.setEmployeeName("srilatha");
		emp1.setAge(20);
		empArray[0]=emp1;
		
		Employee emp2 = new Employee();
		emp2.setEmployeeName("latha");
		emp2.setAge(22);
		empArray[1]=emp2;
		
		Employee emp3 = new Employee();
		emp3.setEmployeeName("sri");
		emp3.setAge(12);
		empArray[2]=emp3;
		
		Employee emp4 = new Employee();
		emp4.setEmployeeName("srilatha");
		emp4.setAge(20);
		empArray[3]=emp4;
		
		
		System.out.println("employee 1 details : "+emp1.toString());
		System.out.println("employee 1 details : "+emp1);
		
//		System.out.println("employee name : "+emp2.getEmployeeName());
//		System.out.println("employee age : "+emp2.getAge());
//		
//		
//		System.out.println("employee name : "+emp3.getEmployeeName());
//		System.out.println("employee age : "+emp3.getAge());
//		
//		System.out.println("employee name : "+emp4.getEmployeeName());
//		System.out.println("employee age : "+emp4.getAge());
//				//return empArray;
		
		return new Employee[] {emp1,emp2,emp3,emp4};
		
		
	}
	

}
