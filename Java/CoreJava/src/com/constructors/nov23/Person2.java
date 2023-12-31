/*
 * 2.Write a program that covers Constructor chaining ,this statement and super statement  
 * and this and super keywords ?
 */
package com.constructors.nov23;

public class Person2 
{
	String name;
	int age;
	char gender;
	
	public Person2(String name, int age, char gender) 
	{
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public void details()
	{
		System.out.println("Name: "+name+"\nAge: "+age+"\nGender: "+gender);
	}
}
