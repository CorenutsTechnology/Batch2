package com.constructors.nov23;

public class Employee2 extends Person2
{

	String companyName;
	String location;
	String desgn;
	double salary;
	
	public Employee2(String name, int age, char gender, String desgn , double salary) 
	{
		super(name, age, gender);
		super.name=name;
		this.desgn=desgn;
		this.salary =salary;
	}
	public Employee2(String name, int age, char gender,String desgn , double salary ,String companyName , String location)
	{
		this(name,age,gender,desgn,salary);
		this.companyName=companyName;
		this.location=location;
	}
	
	@Override
	public void details()
	{
		super.details();
		System.out.println("Designation: "+desgn+"\nSalary: "+salary+"\nCompany: "+companyName+"\nLocation: "+location);
	}
	public static void main(String[] args) 
	{
		Employee2 employee = new Employee2("Rosy",38,'F',"SE",50000,"Feuji","Hyderabad");
		employee.details();
	}

}
