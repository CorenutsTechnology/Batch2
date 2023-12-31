package com.interfaceandabstract.nov16;

public class Ramesh2 implements Person2
{

	public void details()
	{
//		name="raju";
//		age=123; we can not modify final variable values, in interface all variables are static and final
		System.out.println("name: "+name);
		System.out.println("age: "+age);
	}
	public static void main(String[] args) 
	{
		 final Ramesh2 ramesh = new Ramesh2();
		
//		 ramesh = new Ramesh2();
		 //The final local variable ramesh cannot be assigned. 
		 //It must be blank and not using a compound assignment
		Person2 person2 = new Ramesh2();
		person2.details();//using Person2 reference
		
		Ramesh2 ramesh2 = new Ramesh2();
		ramesh2.details();//using ramesh reference
		System.out.println("name: "+name);//static members can be inherited
	}

}
