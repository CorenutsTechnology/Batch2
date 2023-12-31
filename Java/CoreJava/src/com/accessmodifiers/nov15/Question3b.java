package com.accessmodifiers.nov15;

public class Question3b extends Question3a
{
	public void setName()
	{
		name="latha";
	}
	public static void main(String[] args) {
		Question3b object = new Question3b();
		object.setName();
		System.out.println("name: "+object.name);
		System.out.println("age: "+object.age);//final members can be inherited, but can't modify
		//object.age=34; it can't be modified
		object.name="geetha";//it can be inherited and modified
	}
}
