package com.crnt.test.nov;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import Interface_Collection.Exception_in_Inheritance;

public class Exception_in_Inheritance_22 {
	public static void main(String[] args) {
		ExceptionInSubClass exceptionInSubClass = new ExceptionInSubClass();

		// 1.......
//			throws FileNotFoundException {
//			exceptionInSubClass.exceptionInSubClass();

		// 2......
//		exceptionInSubClass.exceptionInSubClass1();

		// 3...
//	throws FileNotFoundException {
//		exceptionInSubClass.exceptionInSubClass2();

//		exceptionInSubClass.exceptionInSubClass4();
		
		//4.....
//		exceptionInSubClass.exceptionInSubClass5();
		
		//5....
		exceptionInSubClass.exceptionInSuperClass3();
       
	}

}

class ExceptionInSuperClass implements Exception_in_Inheritance {

	@Override
	public void exceptionInSubClass() throws FileNotFoundException {
		System.out.println("first one");

		
	}

	@Override
	public void exceptionInSubClass1()  {
		

	}

	@Override
	public void exceptionInSubClass2() throws FileNotFoundException {
		try {
			int value = 10 / 0;
		} catch (ArithmeticException e) {
			throw e;
		}

	}

	@Override
	public void exceptionInSubClass4() throws FileNotFoundException {
		FileInputStream fileInputStream = new FileInputStream("/jhggh/hgfgh/");	// TODO Auto-generated method stub

	}

	@Override
	public void exceptionInSubClass5() {
		// TODO Auto-generated method stub
		int value[]=null;
		try {
			System.out.println(value.length);
		} catch (ArrayIndexOutOfBoundsException e) {
			throw e;
		}
	
				
	}

	@Override
	public void exceptionInSuperClass3() throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fileInputStream = new FileInputStream("/jhggh/hgfgh/");
	}

}

class ExceptionInSubClass extends ExceptionInSuperClass {

	public void exceptionInSubClass() throws FileNotFoundException {

		FileInputStream fileInputStream = new FileInputStream("/jhggh/hgfgh/");

	}

	public void exceptionInSubClass1() {
		try {
			int value = 10 / 0;
		} catch (ArithmeticException e) {
			throw e;
		}

	}

	public void exceptionInSubClass2() throws FileNotFoundException {
		super.exceptionInSubClass2();

		FileInputStream fileInputStream = new FileInputStream("/jhggh/hgfgh/");
	}

	public void exceptionInSubClass4() {
		// TODO Auto-generated method stub
		try {
			int value = 10 / 0;
		} catch (ArithmeticException e) {
			throw e;
		}
	}

	public void exceptionInSubClass5() {
		// TODO Auto-generated method stub
		try {
			int value = 10 / 0;
		} catch (ArithmeticException e) {
			throw e;
		}
	}
		public void exceptionInSuperClass3() {
		System.out.println("exception in super class");

	}
}
