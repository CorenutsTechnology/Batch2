package com.crnuts.classtest;

import com.crnuts.classes.AreaCalculator;
import com.crnuts.classes.Circle;
import com.crnuts.classes.Square;

public class OCPtest {
	
	
	    public static void main(String[] args) {
	        // Creating instances of different shapes
	        Circle circle = new Circle(5);
	        Square square = new Square(4);

	        // Calculating and printing the area of each shape
			AreaCalculator areaCalculator = new AreaCalculator();
	        System.out.println("Area of Circle: " + areaCalculator.calculateArea(circle));
	        System.out.println("Area of Square: " + areaCalculator.calculateArea(square));
	    }
	}


