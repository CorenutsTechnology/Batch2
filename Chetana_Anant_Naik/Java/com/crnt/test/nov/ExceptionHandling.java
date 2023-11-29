package com.crnt.test.nov;

import Interface_Collection.ExceptionHandling_17;

public class ExceptionHandling implements ExceptionHandling_17 {
	public static void main(String[] args) {
		ExceptionHandling excepctionHandling = new ExceptionHandling();
//		excepctionHandling.usingTryCatch(new int[] {1,2,3,4,5});
//		excepctionHandling.arithmaticException();
//		excepctionHandling.usingTryCatchFinally(new int[] {1,1,2,4,7});
//		excepctionHandling.multipleException();
//		excepctionHandling.singleCatchBlock();
//		excepctionHandling.nullPointerException();
//		excepctionHandling.nullPointerException1();
		excepctionHandling.multipleTryCatchFanlly();
	}

	public void usingTryCatch(int[] arr) {
		try {

			System.out.println(arr[6]);// ArrayIndexOutOfBoundsException
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(" Array IndexOutOf Bounds Exception  ");
		}
	}

	public void arithmaticException() {
		try {
			int value = 10 / 0;
			System.out.println(value);// ArithmeticException
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic   Exception");
		}
	}

	public void usingTryCatchFinally(int[] arr) {
		try {
			System.out.println(arr[6]);// ArrayIndexOutOfBoundsException
	} 
//		catch (ArrayIndexOutOfBoundsException e) {
////			 catch(ArithmeticException e){
//			System.out.println(" Array IndexOutOf Bounds Exception  ");
//
//		}
			finally {
			System.out.println("finallly block");
		}

	}

	public void multipleException() {
		int intArray[] = { 2, 4, 7, 8, 9 };
		try {
			System.out.println(intArray[6]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array IndexOut Of  Bounds Exception");
		}
		try {
			System.out.println(intArray[2] / 0);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
	}

	public void singleCatchBlock() {
			int intArray[]= {2,4,7,8,9};
			
			    try {
				int result=intArray[6];
				System.out.println(intArray[0]/0);
			    }
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("single catch block");
			}
			
			finally {
				System.out.println("finallly      ");
			}
			System.out.println("asdfghj");
		}
	public void nullPointerException() {
		
		int intValue[]=null;
		try {
		System.out.println(intValue.length);
		}
		catch(NullPointerException e) {
			System.out.println("NullPointer Exception ");
		}
	}
	public void nullPointerException1() {
		int intValue[]=null;
		System.out.println(intValue.length);
	}
	public void multipleTryCatchFanlly() {
		int intArray[]= {2,4,7,8,9};
		
	    try {
		int result=intArray[6];
		try {
		System.out.println(intArray[0]/0);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
		finally {
			System.out.println("finallly  1     ");
		}
	    }
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Array IndexOut OfBounds Exception");
	}
	
	finally {
		System.out.println("finallly   2   ");
	}
	System.out.println("asdfghj");
	}

}