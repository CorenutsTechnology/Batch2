package com.feuji7nov;

public class Employee
{
	/*Global variables ->we can use any where inside the class.
	 * 
	 * */
	static String COMPANYNAME="FEUJI";
	String empName="Jyothi";
	double empSal=25000;
	int age=22;
	public void displayEmpDetails() {
		System.out.println(Employee.COMPANYNAME);
		System.out.println("Name:"+empName);
		System.out.println("Salary:"+empSal);
		System.out.println("Age:"+age);
	}
	public static void project() {
		String proName="CoreJava";
		int prodays=30;
		System.out.println("ProjectName:"+proName);
		System.out.println("Days:"+prodays);
	}
	public static void main(String[] args) 
	{
		String loc="Hyd";
		
		Employee e1=new Employee();
		e1.displayEmpDetails();
		project();
		System.out.println("Location:"+loc);
		
	}
	

}
