
package com.feuji23nov;

public class StaticVariable 
{
	public static String colour;
	public static String  company;
	public  String type;
	public  int gb;
	public StaticVariable(String colour, String company) 
	{
		
		this.colour=colour;
		this.company=company;
	}
	public StaticVariable(String type,int gb,String colour,String company)
	{
		this(colour,company);
		this.type=type;
		this.gb=gb;
	}

	public static void main(String[] args) 
	{
		StaticVariable s1=new StaticVariable("Bhamus Blue", "Oneplus");
		/*
		 * System.out.println(s1.colour); System.out.println(s1.company);
		 */
		StaticVariable s2=new StaticVariable("Phone", 256, "gold", "Oppo");
		System.out.println("Type:"+s2.type);
		System.out.println("Gb:"+s2.gb);
		System.out.println("colour:"+s2.colour);
		System.out.println("Company:"+s2.company);
		System.out.println(s1.colour);
		System.out.println(s1.company);
		String s=" ";
		
	}
	
	

}
