package com.basicprograms;

import com.extraclass.Person;

public class MethodTopic {
	
	static final int intValue=20;
	String stringValue="method topic";
	final double doubleValue=90;
	Person person;
	
	static void add(int value1,int value2)
	{
		int result=value1+value2;
		System.out.println(result);
	}
	void sub(double value1,double value2)
	{
        double result=value1-value2;
        
		System.out.println(result);
	}
	

	public static void main(String[] args) {
		
		System.out.println(intValue);
		MethodTopic topic=new MethodTopic();
		System.out.println(topic.stringValue);
		Person person=new Person();
		person.setAge(25);
		person.setName("anki");
		System.out.println(person.getName()+" "+person.getAge());
		MethodTopic.add(10, 3);
		topic.sub(20.0,10.0);
		}

}
