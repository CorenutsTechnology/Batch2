package com.org.constructor23;

public class ConOverLoading {
	int age;
	String name;
public ConOverLoading()
{
	this(10);
	System.out.println("no arg");
}
public ConOverLoading(int age)
{
	this(10,"balu");
	this.age=age;
	System.out.println("age is:"+age);
}
public ConOverLoading(String name)
{
this.name=name;	
System.out.println("name is"+name);
}
public ConOverLoading(int age,String name)
{
	this("giri",23);
	this.age=age;
	this.name=name;
	System.out.println("age is:"+age);
	System.out.println("name is"+name);
}
public ConOverLoading(String name,int age)
{
	this("hari");
	this.name=name;
	this.age=age;
	System.out.println("name is"+name);
	System.out.println("age is:"+age);
}
public static void main(String[] args) {
	ConOverLoading con=new ConOverLoading();
}
}
