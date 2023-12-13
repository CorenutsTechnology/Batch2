package com.feuji16nov;

public interface AllAccessModifires 
{
	 void publicMethod();
	 public static void staticMethod()
	 {
		 System.out.println("Static Method");
	 }
	 //if we declare all acess modifire eccept public we will get a compile time error
	 
	//private void privateMethod();//only public default,static are permited.
	
	// protected  void protectedMethod();//illigal modifire for the interface

	  default void defaultMethod() 
	  {
		  System.out.println("default method");
	}//this method reqires a body


}
