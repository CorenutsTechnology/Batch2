package com.accessmodifiers.nov15;

public class Question4b
{
	public static void main(String[] args) 
	{
		Question4 object  = new Question4();
		//default and protected members can be accessed outside of the class using object
		System.out.println("name: "+object.name);
		System.out.println("age: "+object.age);
	}
}
