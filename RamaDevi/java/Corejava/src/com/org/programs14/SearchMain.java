package com.org.programs14;

public class SearchMain {

	public static void main(String[] args) {
		int[] array= {5,8,9,19,45};
		Searching searching=new Searching();
		//System.out.println(searching.linearSearch(array,19));
		System.out.println(searching.binarySearch(array,19));
	}

}
