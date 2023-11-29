package com.crnt.assaignment.nov13;

public class PrintValuesFrom1To100Break47 {
	
	public static void main(String[] args) {
		for (int value = 1; value <=100; value++) {
			if (value!=47) {
				System.out.println(value);
			}
			
			if (value==47) {
				System.out.println("break");
			}
			
		}
	}

}
