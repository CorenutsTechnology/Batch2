package com.learningInterface.difference;

public abstract class Products {
	
	public void defaultDiscount() {
		System.out.println("Default discount is 5% upto RS 200 on all banks credit cards.");
	}
	
	abstract void bankDiscount();

}
