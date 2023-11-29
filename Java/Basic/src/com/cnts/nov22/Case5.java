package com.cnts.nov22;

import java.sql.SQLException;

class SuperClass5
{
	void display() throws RuntimeException
	{
		System.out.println("this method is throwing runtime exception");
		int n=29;
		int m=0;
		System.out.println(n/m);
	}
	
	void display2() throws SQLException
	{
		System.out.println("this method is throwing sql data exception");
	}
	
}

class SubClass5 extends SuperClass5
{
	@Override
	void display()  {
		super.display();
		System.out.println("override method=1");
	}
	
	@Override
	void display2() {
		System.out.println("override method=2");
	}
}
public class Case5 {

	public static void main(String[] args) {
		SubClass5 class5 = new SubClass5();
		class5.display();
		class5.display2();
	}
}
