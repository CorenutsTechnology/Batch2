package com.feuji15nov;
abstract class IncompleteClass
{
	int a=10;
	 public String name="Jyothi";
	 private double value1=23.4;
	abstract void abstractMethod();
	
}
 public  class AbstractClass  extends IncompleteClass
{
	 @Override
		void abstractMethod() 
	 {
		 System.out.println(a);
		 System.out.println(name);
				
		}
	public static void main(String[] args) 
	{
		/*
		 * IncompleteClass result=new IncompleteClass(); //can not intantiate the type.
		 * System.out.println(result.a);
		 */ 
		AbstractClass result=new AbstractClass();
		result.abstractMethod();
		
	}

	
}
