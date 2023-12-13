package com.feuji23nov;

import java.io.IOException;

class Parent {
	
		public void method1() throws Exception
		{
		System.out.println("Base Class Method 1");
		}
		}
		public class Child1 extends Parent{
		public void method1() 
		{
		System.out.println("Child Class Method 1");
		}
		public static void main(String[] arg)
		{
		try {
		Parent c = new Child1();
		c.method1();
		}catch(Exception e)
		{
		System.out.println("Exception");
		}
		}
		}

			
		
	


