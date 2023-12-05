package com.cnts.solidprinciples_01;

public class Rectangle implements Shape2{

	private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

}
