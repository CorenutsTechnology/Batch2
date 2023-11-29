package com.cnts.classprogram;

public class Singelton {

	private static Singelton obj;
	private Singelton()
	{
		
	}
	
	public static Singelton getObj()
	{
		if(obj == null)
		{
			obj = new Singelton();
			System.out.println(obj);
		}
		return obj;
	}
	
	public static void main(String[] args) {
		
	}
}
