package com.feuji15nov;

public class AccessModifiers 
{
	public int a=10;
	private int b=20;
	int c=20;
	protected  String result="Jyothi";
	
	public AccessModifiers()
	{
		AccessModifiers.add(10,20);
		//AccessModifiers accessModifiers = new AccessModifiers();
		//smul(10, 20);
	}
	private  static void  add(int a,int b)
	{
		System.out.println(a+b);
	}
	private void mul(int a,int b)
	{
		System.out.println(a*b);
	}
	public void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(result);
	}
	public static void main(String[] args) 
	{
		AccessModifiers modifiers=new AccessModifiers();
		
		add(10,20);
		modifiers.display();
	}

}
