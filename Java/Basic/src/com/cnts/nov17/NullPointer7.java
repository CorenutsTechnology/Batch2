package com.cnts.nov17;

public class NullPointer7 {
	
public static void main(String[] args) {
//	 String nullString = null;
//
//     try {
//         // This line will throw a NullPointerException
//         int length = nullString.length();
//     }
//     catch (NullPointerException e) 
//     {
//         System.out.println("NullPointerException caught: " + e.getMessage());
//         e.printStackTrace();
//     }
	
	NullPointer7 pointer = new NullPointer7();
	pointer.display();
}

public void display() throws NullPointerException
{
	String nullString = null;
	int length = nullString.length();
	throw new NullPointerException();
	}
}
