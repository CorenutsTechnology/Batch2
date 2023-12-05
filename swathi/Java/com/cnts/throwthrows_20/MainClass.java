package com.cnts.throwthrows_20;

public class MainClass {
	public static void main(String[] args) {
		CallerClass callerClass = new CallerClass();
		try {
			callerClass.arrayException();
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

}
