/*

 * 1. Write a program by utilizing all utility functions of wrapper classes and show the
     difference from one class function to another class function
	1.valueOf(String) method && valueOf(class)
	2.
		public byte byteValue()
public short shortValue()
public int intValue()
public long longValue()
public float floatValue()
public float doubleValue()
	3. parseXxx() Method(except for character)
 */
package com.wrapperclass.nov27;

public class UtilityFunctions1 {

	public static void main(String[] args) 
	{
		//for Character class this method is not available
		Byte b1 = Byte.valueOf("10");
		System.out.println(b1);
		Short s1 = Short.valueOf("10");
		System.out.println(s1);
		Integer i1 = Integer.valueOf("100");
		System.out.println(i1);
		Long l1 = Long.valueOf("100934");
		System.out.println(l1);
		Double d1 = Double.valueOf("9.0");
		System.out.println(d1);
		Float f1 = Float.valueOf("123");
		System.out.println(f1);
		//or
		
		Integer i2 =Integer.valueOf(10);
		System.out.println(i2);
		
		//***Value() method 
		//this method is not available for Character class
		byte b = b1.byteValue();
		System.out.println(b);
		short s =s1.shortValue();
		System.out.println(s);
		int i =i2.intValue();
		System.out.println("int - :"+i);
		long l = l1.longValue();
		System.out.println(l);
		double d = d1.doubleValue();
		System.out.println(d);
		float f = f1.floatValue();
		System.out.println(f);
		
		//parse***() method available for all the classes
		
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

		//toString()
		Integer I = new Integer("10"); 
        String S = I.toString(); 
        System.out.println(S); 
	}

}
