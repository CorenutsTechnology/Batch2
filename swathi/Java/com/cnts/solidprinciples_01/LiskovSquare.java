package com.cnts.solidprinciples_01;

public class LiskovSquare extends LisKov {
	
	public void density() {
		System.out.println("The density is 0.2 to 1.2 gms");
	}
	
	//Another area of square
	public void area() {
		int a=4;
		System.out.println("Area = "+(a*a));
	}

}
