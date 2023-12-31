//6. Write a program to implement different methods of wrapper class.

package com.wrapperclass.nov27;

public class MethodsOfWC6 {

	public static void main(String[] args) 
	{
		Integer i1 =100;
		Integer i2 =200;
		int r1 = i1.compareTo(i2);
		System.out.println(r1);
		
		System.out.println(i1.equals(i2));
		System.out.println(Integer.min(i2, i1));
		System.out.println(Integer.max(i2, i1));
	}

}
