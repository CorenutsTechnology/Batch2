package com.feuji28nov;

public class GenaricTest 
{
	public static void main(String[] args) 
	{ 
		//Genaric genaric =new Genaric<>();
		Genaric<Integer> genaric=new Genaric<>();
		genaric.setId(1);
		/*
		 * //complitime error type generic String argument not applicable
		 * generic.setName("jyothi");
		 */
		genaric.setName(123);
		genaric.setLocation(12345);
		System.out.println(genaric.getId());
		System.out.println(genaric.getName());
		System.out.println(genaric.getLocation());
		
		Genaric<String> generic1=new Genaric<>();
		generic1.setId("1");
		generic1.setName("Jyothi");
		generic1.setLocation("hyd");
		System.out.println(generic1.getId());
		System.out.println(generic1.getName());
	}

}
