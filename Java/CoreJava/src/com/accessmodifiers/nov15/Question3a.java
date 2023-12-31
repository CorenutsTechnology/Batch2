//3. Write a program that includes all the non-access modifiers (on variables and
// methods).
package com.accessmodifiers.nov15;

public abstract class Question3a 
{
	final int age=76;
	String name ="seetha";
	 
	public final void printDetails()
	{
		System.out.println("name: "+name+" age: "+age);
	}
	
	public abstract void setName();
}
