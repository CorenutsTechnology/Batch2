package com.crnuts.entity;

import com.crnuts.interfaces.Shape;

// Circle class implementing the Shape interface
	public class Circle implements Shape {
	    private double radius;

	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    @Override
	    public double calculateArea() {
	        return Math.PI * radius * radius;
	    }
	}

