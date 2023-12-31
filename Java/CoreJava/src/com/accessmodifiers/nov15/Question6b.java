package com.accessmodifiers.nov15;

public class Question6b extends Question6
{
	public void display()
	{
		System.out.println("its overriden method");
		System.out.println("name: "+name+" age: "+age);
	}
	public void concreateMethod()
	{
		super.concreateMethod();
		System.out.println("overriden concreate method");
	}
	public static void main(String[] args) 
	{
		Question6b object2 = new Question6b();
		object2.display();
		object2.concreateMethod();
		
	}
}
