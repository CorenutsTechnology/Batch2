package com.org.accessModifiers15;

 class AccessSpcifiersBean {

	public AccessSpcifiersBean()
	{
		System.out.println("constructor");
	}
	public   void checkMethod()
	{
		System.out.println("method");
	}
}
public class AccessSpcifiers
{
	public static void main(String[] args) {
		AccessSpcifiersBean accessSpcifiersBean=new AccessSpcifiersBean();
		
	}
}
