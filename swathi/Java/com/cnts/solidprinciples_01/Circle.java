package com.cnts.solidprinciples_01;

public class Circle implements Shape2{
	private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

}
