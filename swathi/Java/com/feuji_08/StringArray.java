package com.feuji_08;

public class StringArray {
	
	public String[] stringArr(String[] stringArray) {
		
		System.out.println(stringArray[0]);
		System.out.println(stringArray[1]);
		System.out.println(stringArray[2]);
		System.out.println(stringArray[3]);
		
		
		return stringArray;
		
	}
	
	public static void main(String[] args) {
//		String[] stringValues = new String[4];
//		stringValues[0]="Bengaluru";
//		stringValues[1]="Hyderabad";
//		stringValues[2]="Chennai";
//		stringValues[3]="Kerala";
//		
//		for(int i=0;i<=stringValues.length-1;i++) {
//			System.out.println(stringValues[i]);
//		}
		
		StringArray sarray = new StringArray();
		sarray.stringArr(new String[] {"Bengaluru","Hyderabad","Chennai","Kerala"});
	}

}
