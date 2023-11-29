package com.crnt.operatorsnov0923;

import com.crnt.nov07231.Employee;

public class InstanceOfOperator {
	public static void main(String[] args) {
		
		InstanceOfOperator i = new InstanceOfOperator();
		System.out.println(i.instaceofTest("sri"));
		System.out.println(i.instaceofTest2(new Employee()));
	}
	public  boolean instaceofTest(Object object)
	{
		return object instanceof String;
	}
	public  boolean instaceofTest2(Object object)
	{
		return object instanceof Employee;
	}


}
