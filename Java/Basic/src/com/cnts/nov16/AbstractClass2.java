package com.cnts.nov16;

//Abstract class
abstract class Shape {

	public abstract void draw(); // Abstract method

	public Shape() // Constructor
	{
		System.out.println("Abstract class can have Constructor:");
	}

	public void display() // Concrete method
	{
		System.out.println("Displaying shape");
	}
}

//Concrete class extending the abstract class
class Circle extends Shape {
	public Circle() { // Call the constructor of the abstract class
	}

	@Override
	public void draw() {
		System.out.println("Drawing circle");
	}

}

public class AbstractClass2 {
	public static void main(String[] args) {

//     Circle circle = new Circle();      
	   Circle circle2 = new Circle(); // Creating an object of the Circle class
	   circle2.draw(); // Calling abstract method
	   circle2.display(); // Calling concrete method
	}
}
