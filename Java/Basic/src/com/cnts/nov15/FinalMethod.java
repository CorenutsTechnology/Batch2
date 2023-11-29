package com.cnts.nov15;

public class FinalMethod 
{
	final void display()
	{
		System.out.println("This is a final method");
		System.out.println("We cant override the final method in subclass");
		/*
		 * FinalMethod  exampleClass =  new FinalMethod();
	       exampleClass.display();
         

           public void display()    this line will give error
           {
	        }
		 * 
		 * 
		 */
	}
}
