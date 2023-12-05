package com.crnts.Generics;

import java.util.ArrayList;

public class UseGenericsP1 {

	public static void main(String[] args) {
		UseGenericsP1 useGenericsP1 = new UseGenericsP1();
		useGenericsP1.programUsingGenerics();
		useGenericsP1.programWithOutGenerics();
	}

	public void programUsingGenerics() {
		ArrayList<Integer> array1 = new ArrayList();
		array1.add(9);
//		array1.add("rakhi");   CTE

		for (Integer item : array1) {
			System.out.println(item * 0);
		}
	}

	public void programWithOutGenerics() {
		ArrayList array = new ArrayList();
		array.add(9);
		array.add("rakhi");

		for (Object item : array) {
			String names = (String) item; // ClassCastException
		}

	}
	

	
	

}
