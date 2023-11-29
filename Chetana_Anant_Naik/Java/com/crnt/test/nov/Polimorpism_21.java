package com.crnt.test.nov;

import Interface_Collection.Polimorpism;

public class Polimorpism_21 {
public static void main(String[] args) {
	Dog dog=new Dog();
	System.out.println(dog.num);
	dog.animalRelation();
	dog.dogRelation();
}

}
class Animal implements Polimorpism{
	int num=20;
public void animalRelation() {
	String name1="animal ";
	System.out.println("name is  "+name1);
}
}
class Dog extends Animal{
	
	int num=10;
	public void dogRelation() {
		super.animalRelation();
		String name="Dog ";
		System.out.println("name is  "+name);
	}
}
