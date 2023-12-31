package com.exception_overriding.nov22;

public class Ram extends Person
{
	Ram()
	{
		super();
		super.g="f";
		System.out.println("ram class");
	}
	 void view()
	{
		super.display();
		System.out.println(super.age+" "+super.num);
	}
	public static void main(String[] args) {
		Ram ram =  new Ram();
		ram.view();
	}
}
