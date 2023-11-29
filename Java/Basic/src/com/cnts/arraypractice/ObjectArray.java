package com.cnts.arraypractice;

import com.cnts.bean.Employee;

public class ObjectArray
{
	public static void main(String[] args) {
		ObjectArray array = new ObjectArray();
		Employee[] employee = array.employees();
	
		System.out.println(employee[0]);
	}
	
	public Employee[] employees()
	{
//		Employee[] employee = new Employee[5];
		
		Employee employee1 = new Employee();
//		employee[0]= employee1;
		
		Employee employee2 = new Employee();
//		employee[1] = employee2;
				
		Employee employee3 = new Employee();
//		employee[2] = employee3;
		
		Employee employee4 = new Employee();
//		employee[3] = employee4;
		
		return (new Employee[] {employee1,employee2,employee2,employee3,employee4});
	}
}
