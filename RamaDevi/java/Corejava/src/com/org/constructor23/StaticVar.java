package com.org.constructor23;

public class StaticVar {
static int age;
static String name;
public StaticVar()
{
	this.age=age;
	this.name=name;
	System.out.println("name is:"+name);
	System.out.println("age is:"+age);
}
public StaticVar(int age,String name)
{
	this.age=age;
	this.name=name;
	System.out.println("name is:"+name);
	System.out.println("age is:"+age);
}
	public static void main(String[] args) {
		StaticVar var=new StaticVar(10,"tahj");

	}

}
