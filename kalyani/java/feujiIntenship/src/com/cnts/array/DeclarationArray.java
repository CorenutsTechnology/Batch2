package com.cnts.array;

public class DeclarationArray {

	public static void main(String[] args) {
		DeclarationArray array=new DeclarationArray();
		array.intArray();
		array.doubleArray();
		array.stringArray();
		array.charArray();
		array.booleanArray();

	}
	public void intArray() {
		int[] intArray=new int [5];
		intArray[0]=10;
		intArray[1]=20;
		intArray[2]=30;
		intArray[3]=40;
		intArray[4]=50;
		System.out.println(intArray[3]);
		
	}
	public void doubleArray() {
		double[] doublearray=new double [5];
		doublearray[0]=10.5;
		doublearray[1]=20.3;
		doublearray[2]=30.78;
		doublearray[3]=40.76;
		doublearray[4]=50.34;
		System.out.println(doublearray[4]);
		
	}
	public void stringArray() {
		String[] stringArray=new String [5];
		stringArray[0]="hyderabad";
		stringArray[1]="bengolere";
		stringArray[2]="chennai";
		stringArray[3]="kerla";
		stringArray[4]="pune";
		System.out.println(stringArray[2]);
		
	}
	public void charArray() {
		char[] charArray=new char [5];
		charArray[0]='a';
		charArray[1]='b';
		charArray[2]='c';
		charArray[3]='d';
		charArray[4]='e';
		System.out.println(charArray[2]);
		
	}
	public void booleanArray() {
		boolean[ ] booleanArray= new boolean[3];
		booleanArray[0]=true;
		booleanArray[1]=false;
		booleanArray[2]=true;
		System.out.println(booleanArray[0]);
	}
	
	
	

}
