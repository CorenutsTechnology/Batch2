package com.cnts.constructors;

public class Person {
	public String name;
	public int age;
	String email="swathi@gmail.com";
	public Person() {
		System.out.println("Person class");
	}
	public Person(String name) {
		this();
		this.name=name;
	}
	public Person(String name, int age) {
	this(name);
	this.age = age;
	}
	
}
