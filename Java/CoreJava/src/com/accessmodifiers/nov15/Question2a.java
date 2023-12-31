/*
 *  Write a program that includes all the access modifiers (on variables and methods) in
one package and access them in some other package class.

 */
package com.accessmodifiers.nov15;
public class Question2a 
{
	public String name="pranathi";
	protected int age=23;
	long phone=98765354298l;//default
	private String gender="female";
	
	public String getName() {
		return name;
	}
	protected int getAge() {
		return age;
	}
	 long getPhone() {
		return phone;
	}
	private String getGender() {
		return gender;
	}
	
	
}
