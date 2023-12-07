package com.crnuts.test;

import java.util.ArrayList;

//QUES 6

import com.crnuts.classes.Employee;

public class EmployeeTestQues_6 {

	public static void main(String[] args) {
		
		ArrayList<Employee> arrayList=new ArrayList<>();
		
		arrayList.add(new Employee(5, "shteya", 52625,"Gaya"));
		
		arrayList.add(new Employee(6, "zcds", 65625,"Kolkata"));
		
		arrayList.add(new Employee(3, "manish", 67625,"Ranchi"));
		
		for(Employee emp:arrayList) {
			System.out.println(emp);
		}


		
		

	}

}
