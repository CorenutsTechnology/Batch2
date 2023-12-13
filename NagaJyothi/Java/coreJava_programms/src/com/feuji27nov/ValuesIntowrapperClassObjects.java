package com.feuji27nov;

public class ValuesIntowrapperClassObjects 
{
	public static void main(String[] args) 
	{
		byte byteValue=123;
		Byte byteObj=byteValue;
		System.out.println(byteObj);
		
		short shortValue=12345;
		short shortObj=Short.valueOf(shortValue);
		System.out.println("Short value:"+shortObj);
		
		int intValue=10;
		Integer integerObj=new Integer(intValue);
		
		int i2=integerObj;
		System.out.println("Integer value:"+integerObj);
		// float value
		float floatValue=10.0f;
		Float floatrObj=new Float(floatValue);
		System.out.println("Float value:"+floatrObj);
		//Double value
		 double doubleValue=6789.00;
		Double doubleObj=doubleValue;
		
		System.out.println("double value:"+doubleObj);
		
		//long value
		long longValue=123456789;
		Long longObject=Long.valueOf(longValue);
		//Long value=Double.valueOf(2345.6);
		System.out.println("LongObject:"+longObject);
		char ch='J';
		Character charObj=Character.valueOf(ch);
		System.out.println("Character value:"+charObj);
		System.out.println("---------");
		boolean value=true;
		Boolean object=value;
		System.out.println("boolean value:"+object);
		
	}

}
