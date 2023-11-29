package com.cnts.basic;

import com.cnts.bean.Employee;

public class Demo {
	int intValue=232;
	String stringValue;
	static int maxValue ;
	

	
	void display()
	{
		double persentage = 67.7;
		System.out.println(persentage);
	}
	
	public static void main(String[] args)
	{
	
		Demo demo = new Demo();
		System.out.println(demo.intValue);
		System.out.println(demo.stringValue);
		
		Employee employee = new Employee();
		employee.setName("Anisha");
		employee.setEmail("anisha@gmail.com");
		employee.setSalary(50000);
		System.out.println(employee.getName()+" "+employee.getEmail()+" "+employee.getSalary());
		
		System.out.println(maxValue);
		System.out.println();
		
		demo.display();
		
	}
}
