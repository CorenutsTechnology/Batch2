package com.crnt.flowcontrols.nov1023;

import java.util.Iterator;

import com.crnt.nov07231.Employee;

public class LoppingStatement {
//	public static void main(String[] args) {
//		LoppingStatement loopingStatement = new LoppingStatement();
//		loopingStatement.whileStatement();
//		loopingStatement.forLoop();
//	}
	public boolean whileStatement()
	{
		boolean flag =true;
		int i=0;
		while (flag) {
			System.out.println(i+ "");
			int j=0;
			do {
				if (i==6)
				{
					System.out.println("6 th iteration ...");
					break;
				}
				i++;
			}
			while(j++<=20);
			flag=(i++<=10);
			
		}
		return flag;
		
	}
	public boolean forLoop()
	{
		for(int index=0;index<=10;index++)
		{
			System.out.println(index);
		}
		return false;
	}
	
	public Employee[] arrayObject()
	{
//		Employee object1 = new Employee();
//		object1.setEmployeeName("rakesh");
//		object1.setAge(23);
//		
//		Employee object2 = object1;
		
		Employee [] emp = new Employee[5];
		
		
		
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i].getEmployeeName());
			
		}
		
//		
//		Employee [] employee = new Employee[] {new Employee("srilatha", 22),new Employee(), new Employee(),
//				object1,object2};
//		for(int index=0;index<=employee.length-1;index++)
//		{
//			System.out.println(employee[index]);
//		}
		return emp;
		
	}

}
