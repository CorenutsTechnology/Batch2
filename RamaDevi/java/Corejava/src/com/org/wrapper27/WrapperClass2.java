package com.org.wrapper27;

public class WrapperClass2 {

	public static void main(String[] args) {
		byte byteVal=1;
		short shortVal=15;
		int intVal=10;
		long longValu=3238;
		float floatValu=537.8f;
		double doubleVal=3602.08;
		boolean bolValu=true;
		char charVal='y';
		//primitive to wrapper
		Integer integer=new Integer(intVal);
		System.out.println("Integer value is:"+integer);
		Byte byt=Byte.valueOf(byteVal);
		System.out.println("byte value is:"+byt);
		Short shor=Short.valueOf(shortVal);
		System.out.println("short is:"+shor);
		Long lon=Long.valueOf(longValu);
		System.out.println("long is:"+lon);
		Float flo=Float.valueOf(floatValu);
		System.out.println("float is:"+flo);
		Double dou=Double.valueOf(doubleVal);
		System.out.println("double is:"+dou);
		Boolean bool=Boolean.valueOf(bolValu);
		System.out.println("boolean is:"+bool);
		Character ch=Character.valueOf(charVal);
		System.out.println("character is:"+ch);
		//wrapper to primitive
		int intva=integer.intValue();
		System.out.println(intva);
		

	}

}
