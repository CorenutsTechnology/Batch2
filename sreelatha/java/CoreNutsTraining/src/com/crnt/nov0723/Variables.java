package com.crnt.nov0723;

import com.crnt.nov07231.Employee;

public class Variables {
	static String name ="corenuts_technologies";
	int numberOfEmployees= 45;
	double salary = 12000.00;
	public Employee emp;
	public int developer(int value1, int value2)
	
	{
		int result = value1+value2;
		return result;
		
	}
	public static void tester(int value1, int value2)
	{
		int result2=value1+value2;
		System.out.println("resulted number of testers : "+result2);
	}
	public static void main(String[] args) {
		
		System.out.println("name of the company : "+Variables.name);
		Variables variables = new Variables();
		System.out.println("number of employees in a company : "+variables.numberOfEmployees);
        System.out.println("salary for each employee : "+variables.salary);
       int result= variables.developer(10, 20);
       System.out.println("resulted number of developers :  ="+result);
       Variables.tester(2, 3);
       
       double mrngOfficeTime=9.00;
       System.out.println("morning office reached at : "+mrngOfficeTime);
       
       System.out.println("salary will be : "+variables.salary);
       
       Employee emp1 = new Employee();
       emp1.setEmployeeName("srilatha goriparthi");
      System.out.println("name of the employee : "+emp1.getEmployeeName()); 
      emp1.setAge(22);
      System.out.println("age of the employee : "+emp1.getAge());
      System.out.println(args[0]);
      System.out.println(args[1]);
      //passby value and passby refference
	}
	

}
