package com.cnts.nov27.wrraperclass;

public class WrapperClass2 {
	public static void main(String[] args) {
		
		byte b1 = 23;
		Byte byte1 = new Byte(b1);  // Wrap the byte value in an Byte object
		System.out.println(byte1);
		
		short s = 234;
		Short short1 = new Short(s);  // Wrap the short value in an Short object
		System.out.println(short1);
		
		int i = 19;
		Integer integer = new Integer(i); // Wrap the int value in an Integer object
		System.out.println(integer);

		double d = 34.03;
		Double double1 = new Double(d); //Wrap the double value in an Double object
		System.out.println(double1);
		
		float f = 239.249f;
		Float float1 = new Float(f);  //Wrap the float value in an Float object
		System.out.println(float1);
		
		boolean b=true;
		Boolean boolean1 = new Boolean(b);  //Wrap the boolean value in an Boolean object
		System.out.println(boolean1);
		
		char c = 's';
		Character character = new Character(c);  //Wrap the char value in an Character object
		System.out.println(character);
	}
}
