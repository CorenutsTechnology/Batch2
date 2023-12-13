package com.feuji7nov;

public class DataTypes 
{
	byte byteValue=120;
	short shortValue=1234;
	int intValue=1234456;
	long longValue=123456789;
	float floatValue=223.5f;
	double doubleValue=12345.5;
	boolean flag=true;
	char ch='a'; 
	public void displayDataTypes()
	{
		System.out.println("Byte value"+byteValue);
		System.out.println("Short value:"+shortValue);
		System.out.println("int value:"+intValue);
		System.out.println("long value:"+longValue);
		System.out.println("float value:"+floatValue);
		System.out.println("double value:"+doubleValue);
		System.out.println("Boolean value:"+flag);
		System.out.println("Character value:"+ch);
	}
	public static void main(String[] args)
	{
		DataTypes datatype=new DataTypes();
		datatype.displayDataTypes();
		
	}
	
			

}
