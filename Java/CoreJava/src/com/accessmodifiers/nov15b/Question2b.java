package com.accessmodifiers.nov15b;

import com.accessmodifiers.nov15.Question2a;

public class Question2b extends Question2a
{
	public static void main(String[] args) {
		//here we can access only protected and public members of Question2a class
		Question2b object = new Question2b();
		System.out.println("public access modifier, name: "+object.getName());
		System.out.println("protected access modifier, age: "+object.getAge());
		System.out.println("age: "+object.age);
//		System.out.println("default access modifier, age: "+object.getPhone());
//		System.out.println("private access modifier, age: "+object.getGender());
	}
}
