  package com.cnts.wrapperclasses_27;
//progarm7
public class WrapperClass {
	
	public void primitiveToWrapper() {//auto boxing
		int intValue1=34560;
		byte byteValue=123;
		long longValue=123456l;
		boolean booleanValue=false;
		
		Integer value1=new Integer(intValue1);
		Byte value2=byteValue;
		Long value3 = new Long(longValue);
		Boolean value4=booleanValue;
		System.out.println("Integer Value is : "+value1);
		System.out.println("Byte Value is : "+value2);
		System.out.println("Long Value is : "+value3);
		System.out.println("Boolean Value is : "+value4);
		
		
	}
	public void wrapperToPrimitive() { // auto Unboxing
		Integer Integervalue=new Integer(12345);
		int intValue=Integervalue;
		System.out.println("int value is : "+intValue);
		Float floatValue = 1234.87f;
		float value1 = floatValue;
		System.out.println("float value is : "+value1);
		
	}
	
	//program 6
	
	public void wrapperMethods() {
		 char charValue = 'A';
		 Character character=Character.valueOf( charValue);
		 System.out.println("character value is : "+character);
		 
		 
		 Boolean booleanValue = Boolean.valueOf("vshdfjhbfj");//if we give other than boolean value it will return false
		 System.out.println("boolean Value is : "+booleanValue);
		 
		 //toString methods
		 Integer intValue = new Integer(10);
		 System.out.println(intValue.toString());
		 
		 String s = Integer.toString(10); 
	        System.out.println(s); 
	        
	        //public static String toString(primitive p, int radix);//it is converting primitive to binary
	        String s1 = Long.toString(3, 2); 
	        System.out.println(s1); 
		 
		 
		 double doubleValue = Double.parseDouble("23.67");
		 System.out.println("double value is : "+doubleValue);
		 
		 System.out.println(new Double(244.87).longValue());
		 System.out.println(new Long(123).doubleValue());
		 //Number FormatException
//		int intValue1=Integer.parseInt("ten");
//		 System.out.println(intValue1);
		 
		 float floatValue = new Float(234.67).longValue();
		 System.out.println(floatValue);	 
		 
	}
	//program 5
	public boolean isNumber(String input) {
		try {
			Double.parseDouble(input);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
		
	}
	
	
}
