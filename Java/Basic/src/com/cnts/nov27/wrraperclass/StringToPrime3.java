package com.cnts.nov27.wrraperclass;

public class StringToPrime3 {

	public static void main(String[] args) {
		
		String b1 = "23";
		Byte byte1 = new Byte(b1);  
		System.out.println(byte1);
		
		String s = "234";
		Short short1 = new Short(s);  
		System.out.println(short1);
		
		String i = "19";
		Integer integer = new Integer(i); 
		System.out.println(integer);

		String d = "34.03";
		Double double1 = new Double(d); 
		System.out.println(double1);
		
		String f = "239.249f";
		Float float1 = new Float(f);  
		System.out.println(float1);
		
		String b="true";
		Boolean boolean1 = new Boolean(b);  
		System.out.println(boolean1);
		
		String c = "s";
		Character character = c.charAt(0);  
		System.out.println(character);
	}
}
