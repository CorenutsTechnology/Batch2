package com.feuji23nov;

public class SeniorEmployee extends Employee
{
	
	private double experience;

	public SeniorEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SeniorEmployee(int empId, String empName, double empSal, String designation,double experience) {
		super(empId, empName, empSal, designation);
		this.experience=experience;
		
	}
	public void seniorDetails()
	{
		displayDetails();
		System.out.println("Experiance:"+experience);
	}
	public static void main(String[] args) 
	{
		SeniorEmployee result=new SeniorEmployee(1,"Jyothi",35000.0,"java developer",0.6);
		result.seniorDetails();
		Employee e1=new Employee(2,"indu",35000.0,"python developer");
		e1.displayDetails();
		
	}

	
	

}
