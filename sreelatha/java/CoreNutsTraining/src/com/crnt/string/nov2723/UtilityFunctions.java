package com.crnt.string.nov2723;

public class UtilityFunctions {
	public void wrapperTest()
	{
		int intValue1=100;
		Integer integer = new Integer(intValue1);//boxing
		System.out.println(integer);
		
		Integer integer1=Integer.valueOf(intValue1);//boxing
		
		System.out.println(integer1);
		
		int unBox = integer1.intValue();//unboxing
		System.out.println(unBox);
		
		Integer i =intValue1;//autoboxing
		System.out.println(i);
		int valueFromObject =i;//autounboxing
		
		System.out.println(valueFromObject);
		
		Character c = new Character('c');
		System.out.println(c);
		
		Boolean b = Boolean.TRUE;
		Boolean b1= new Boolean(true);
		System.out.println(b);
		System.out.println(b1);
		
		
		
		System.out.println(new Double(valueFromObject).longValue());//converts double into long
		
		
		
		
	}

	
}
