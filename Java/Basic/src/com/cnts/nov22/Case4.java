package com.cnts.nov22;

import java.sql.SQLException;

//we cannot throw exception on class level
class SuperClass4 
{
	public void display() throws Exception
	{
		System.out.println("super class is throwing a exception");
	}
}

class SubClass4 extends SuperClass4
{
	@Override
	public void display() throws SQLException {
		System.out.println("sub class is declaring a sub exception of exception");
	}
}
public class Case4 {

	public static void main(String[] args) {
		SubClass4 class4 = new SubClass4();
		try {
			class4.display();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		/*
		 * As we are calling child class overloaded method it is handing the child
		 * class exception
		 */
		
		try {
			class4.display();
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*
		 * As we are calling parent class method it is handing the parent
		 * class exception
		 */
	}
}
