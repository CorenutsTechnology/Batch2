package com.cnts.nov27.wrraperclass;

public class WrapperClass6
{
	public static void main(String[] args) {
		int i = 2000;
		
		Integer integer = new Integer(i);
		
		System.out.println(integer.valueOf(i));
		
		System.out.println(integer.valueOf("1111", 8));
		
		System.out.println(integer.parseInt("656"));
		
		System.out.println(integer.byteValue());
		
		System.out.println(integer.toString());
		
		System.out.println(integer);
	}
}
