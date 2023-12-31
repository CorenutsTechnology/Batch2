/*
 * 4. Write a program to show the difference between default and protected access
modifiers.

 */
package com.accessmodifiers.nov15;

public class Question4 
{
	static String name="ram";//default
	protected int age=23;//protected
	public static void main(String[] args) 
	{
		Question4 object  = new Question4();
		//default and protected members can be accessed within the class
		System.out.println("name: "+name);
		System.out.println("age: "+object.age);
		
	}
}
