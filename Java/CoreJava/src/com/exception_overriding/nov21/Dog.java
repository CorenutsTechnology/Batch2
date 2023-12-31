package com.exception_overriding.nov21;

public class Dog extends Animal1
{
	void display(String color , int age)
	{
		System.out.println("color: "+color+" age: "+age);
	}
	public static void main(String[] args) 
	{
		Dog dog = new Dog();
		dog.color="Black";
		dog.age=5;
		dog.display(dog.color,dog.age);
	}
}
