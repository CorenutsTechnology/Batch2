package com.learningInterface.difference;

public class ElectronicProducts extends Products implements MonthDiscounts{

	@Override
	void bankDiscount() {
		System.out.println("10% discount on electronic products upto RS 500 on SBI bank credit card.");
		
	}

	@Override
	public void additionalDiscount() {
		System.out.println("RS 150 off on cart amount 2500 and above.");
		
	}

	@Override
	public void temperaryDiscount() {
		System.out.println("12% off on  iphone12 ");
		
		
	}
	
	

}
