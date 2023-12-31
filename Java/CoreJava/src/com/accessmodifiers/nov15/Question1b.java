package com.accessmodifiers.nov15;

public class Question1b extends Question1a
{
	public static void main(String[] args) 
	{
		Question1a question1a = new Question1a();
		System.out.println("name: "+question1a.getName());//accessing through object
		
		Question1b Question1b = new Question1b();
		System.out.println("age: "+Question1b.getAge());//accessing through inheritance
	}
}
