package com.feuji21nov;

import java.util.Scanner;
import java.util.Set;
//1 and 6 question.
public class Dog extends Animal
{
	Scanner scan=new Scanner(System.in);
	
public void d() {
	System.out.println("dog method");
}
	public void accessingElements()
	{
		System.out.println("Enter name");
		setName(scan.next());
		System.out.println("Enter colour");
		setColour(scan.next());
		System.out.println("Enter EyesColour");

		setEyesColur(scan.next());
		System.out.println("Name:"+getName());
		System.out.println("colour:"+getColour());
		System.out.println("eyesColour:"+getEyesColur());

	}
	
    public static void main(String[] args) 
    {
    	Dog result=new Dog();
		result.accessingElements();
		Animal a1=new Dog();
		a1.a1();
		//a1.d();The method d() is undefined for the type Animal
		//Dog dog=(Dog)new Animal();//run time exception i.e Class cast exception.
		Dog d1=(Dog) a1;
		d1.setName("Sweety");
		System.out.println("Name of dog is"+d1.getName());
	}
}
