package com.crnuts.entity;

import com.crnuts.interfaces.Shape;

public class Square implements Shape {
	
	private double side;

	public Square(double side) {
		this.side = side;
	}

	@Override
	public double calculateArea() {
		return side * side;
	}

}
