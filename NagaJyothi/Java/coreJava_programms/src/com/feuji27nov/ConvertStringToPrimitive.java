package com.feuji27nov;

public class ConvertStringToPrimitive 
{
	public static void main(String[] args) 
	{
		String value1="10";
		
		int intValue=Integer.parseInt(value1);
		System.out.println("int value:"+intValue);
		String value2="22.5";
		float floatValue=Float.parseFloat(value2);
		System.out.println("Float value:"+floatValue);
		System.out.println("double value"+Double.parseDouble("1234.56"));
		System.out.println("Byte value:"+Byte.parseByte("123"));
	    System.out.println("short value:"+Short.parseShort("1234"));
	    System.out.println("Long value:"+Long.parseLong("12345678"));
	   //  String value3=true; compile time error 
	    String value3="true";
	    boolean booleanValue=Boolean.parseBoolean(value3);
	    System.out.println("Boolean value:"+booleanValue);
		//to string method..
	    String result= Integer.toString(1000);
	    System.out.println("Result:"+result);
		String value=null;
		//String value6=value.toString();//null pointer exception.
		int value6=Integer.parseInt(value);//Number formate exception
		System.out.println(value6);
		//int value10=Integer.valueOf(10);
		int res=Integer.valueOf(10);
	}

}
