
//3. Write a program to convert from String to primitive values.

package com.wrapperclass.nov27;

public class Primitive3 
{
	public static void main(String[] args)
	{

		Integer i = new Integer("100");
//		int p=i.valueOf(p);
		int i3 = Integer.parseInt("100");
		System.out.println(i3);
		byte b2 = Byte.parseByte("108");
		System.out.println(b2);
		short s2 =Short.parseShort("298");
		System.out.println(s2);
		
		long l2 = Long.parseLong("57843");
		System.out.println(l2);
		double d2 = Double.parseDouble("76");
		System.out.println(d2);
		float f2 = Float.parseFloat("87.9");
		System.out.println(f2);
		boolean b = Boolean.parseBoolean("true");
		System.out.println(b);
	}
}
