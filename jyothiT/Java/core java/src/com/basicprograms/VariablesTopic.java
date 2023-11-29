package com.basicprograms;

public class VariablesTopic {
	
	static int intValue=10;
	String stringValue="anki";
	
	static void add()
	{
		int value1=10;
		int value2=20;
		System.out.println(value1+value2);
	}

	public static void main(String[] args) {
		
      System.out.println(intValue);
      VariablesTopic topic=new VariablesTopic();
      System.out.println(topic.stringValue);
      add();
      System.out.println(args);
	}

}
