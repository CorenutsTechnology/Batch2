package com.learningInterface.difference;

public class ProductsTest {

	public static void main(String[] args) {
		System.out.println("-----Difference b/w abstract class and interface-----");
	
		System.out.println();
		
		ElectronicProducts elProducts = new ElectronicProducts();
		elProducts.defaultDiscount();
		elProducts.bankDiscount();
		elProducts.additionalDiscount();
		elProducts.temperaryDiscount();

		System.out.println();
		
		System.out.println("**** ProductDiscounts is an INTERFACE ****");
		MonthDiscounts productDiscounts = new ElectronicProducts();
		productDiscounts.additionalDiscount();
		productDiscounts.temperaryDiscount();

		System.out.println();
		
      System.out.println("*** Products is a abstract class ***");
		Products products = new ElectronicProducts();
		products.bankDiscount();
		products.defaultDiscount();

	}

}
