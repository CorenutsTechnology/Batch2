package com.cnts.nov21;

//SuperClas
class Shape {
	public double calculateArea() {
		return 0.0;
	}
}

//SubClass-1
class Square extends Shape {
	double side;

	public Square(double side)
	{
		this.side=side;
	}
	
	@Override
	public double calculateArea() {
		return side * side;
	}

}

//SubClass-2
class Circle extends Shape {
	double radius;

	public Circle(double radius)
	{
		this.radius=radius;
	}
	
	@Override
	public double calculateArea() {
		
		return Math.PI*radius*radius;
	}
}


//MainClass
public class Runtime7 {

	public static void main(String[] args) {
		
		Shape circle = new Circle(23);
		Shape square = new Square(67);
		
		// Execute the same function on different objects at runtime
		display(circle);
		display(square);
	}
	
	 static void display(Shape shape)
	{
		double area=shape.calculateArea();
		System.out.println("Area is : "+area);
	}
}
