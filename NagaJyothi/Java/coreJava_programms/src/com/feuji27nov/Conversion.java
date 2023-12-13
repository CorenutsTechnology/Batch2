package com.feuji27nov;

public class Conversion 
{
	public static void main(String[] args) 
	{
		int intValue=10;
		Integer integerObj=new Integer(intValue);
		
		System.out.println("Integer object:"+integerObj);
		int intValue1=Integer.valueOf(integerObj);
		System.out.println("int value:"+intValue1);
		System.out.println("------");
		//float value
		float floatValue=100.7f;
		Float floatObj=Float.valueOf(floatValue);
		System.out.println("Float object:"+floatObj);
		float floatValue1=Float.valueOf(floatObj);
		System.out.println("float value:"+floatValue1);
		// double value
		double doubleValue=100.7;
		Double doubleObj=doubleValue;
		double d=doubleObj.doubleValue();
		System.out.println("double object:"+doubleObj);
		double doubleValue1=Double.valueOf(doubleObj);
		System.out.println("float value:"+floatValue1);
		 
		long longValue=1235667;
		Long longObj=longValue;
		System.out.println("Long Object:"+longObj);
		long longValue1=longObj;
		System.out.println("long value:"+longValue1);
		char c='j';
		Character charobj=c;
		char charValue=Character.valueOf(c);
		System.out.println("char object:"+charobj);
		System.out.println("char value:"+charValue);
		
		

		
		
	}

}
