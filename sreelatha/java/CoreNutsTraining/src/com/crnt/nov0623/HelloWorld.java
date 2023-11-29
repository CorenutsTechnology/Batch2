package com.crnt.nov0623;

public class HelloWorld {
   static String name="srilatha";
   long longValue = 12345;
   float floatValue = 123.45f;
   
	public static void main(String[] args) {
		System.out.println("Name "+HelloWorld.name);
		HelloWorld helloWorld = new HelloWorld();
		System.out.println("Long Value : "+helloWorld.longValue);
		System.out.println("Float Value : "+helloWorld.floatValue);
	}
	

}
