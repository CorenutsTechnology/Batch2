package com.org.generic28;

import java.util.ArrayList;

public class GenericClassMain<T> extends GenericClass1<T> {

	public static void main(String[] args) {
//		ArrayList<Integer> arylist=new ArrayList();
//		arylist.add(98);
//		arylist.add(65);
		
		GenericClassMain<String> gen=new GenericClassMain<>();
		System.out.println(gen.method1("Nukd"));
	}

}
