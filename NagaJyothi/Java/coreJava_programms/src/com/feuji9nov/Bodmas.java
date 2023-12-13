package com.feuji9nov;

public class Bodmas
{
	public static void main(String[] args) 
	{
		Bodmas bodmas = new Bodmas();
		bodmas.addition(10, 20);
	}
	public int addition(int value1,int value2)
	{
		int add=((value1+value2)-10)*30/5;
		System.out.println(add);
		return add;
	}
	public int operation()
	{
		return 0;
	}
	


}
