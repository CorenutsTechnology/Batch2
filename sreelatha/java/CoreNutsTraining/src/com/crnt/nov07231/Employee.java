package com.crnt.nov07231;

public class Employee  implements Comparable{//pojo || bean || plain
	private String employeeName ;
	private int age ;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String employeeName, int age) {
		super();
		this.employeeName = employeeName;
		this.age = age;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
