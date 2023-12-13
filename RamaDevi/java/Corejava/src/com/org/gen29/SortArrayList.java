package com.org.gen29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) {

		List<Product> products = new ArrayList();
		products.add(new Product("Tv", 4000));
		products.add(new Product("Ac", 2500));
		products.add(new Product("fridge", 22000));
		products.add(new Product("Cooler", 2000));
		
		// Displaying the elements
//		System.out.println("Before sorting");
//		for (Product product : products) {
//			System.out.println(product);
//		}
//		System.out.println("After sorting");
//		System.out.println("-------");
		// using price compare
		Collections.sort(products, new NameCompare());
		Collections.sort(products, new PriceCompare());
		//Collections.sort(products, new NameCompare());
		for (Product product : products) {
			System.out.println(product);
		}
		System.out.println("-------");
//       //using name compare
//		Collections.sort(products, new NameCompare());
//		for (Product product : products) {
//			System.out.println(product);
//		}
	}

}
