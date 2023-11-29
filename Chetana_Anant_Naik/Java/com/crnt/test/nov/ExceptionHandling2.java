package com.crnt.test.nov;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.crnt.bean.UserDefineException;

import Interface_Collection.ExceptionHandling2_20;

public class ExceptionHandling2 implements ExceptionHandling2_20 {

public static void main(String[] args) throws Exception {
	ExceptionHandling2 exceptionHandling2 =new ExceptionHandling2();

	exceptionHandling2.calllingMethod();
	
	
}
public void calllingMethod() throws UserDefineException {
	ExceptionHandling2 exceptionHandling3 =new ExceptionHandling2();
//	1..........
//	try {
//	
//exceptionHandling2.checkedException();
//
//}
//catch(Exception e) {
//System.out.println("checked  Exception");
//throw new Exception("errors");
//}
	
//	2...........
//      exceptionHandling3.userDefineException();
	
	//3.....
//      exceptionHandling3.fromCatch();
      
      //4....
//      exceptionHandling3.nestedTryBlock();
      
      //5...
//	try {
//      exceptionHandling3.reThrowFromCatch();
//	}catch(Exception e) {
////		System.out.println("ReThrowFromCatch");
//		throw new UserDefineException("RE THROW FROM CATCH ");
//	}
	
	//6..
//	try {
//	exceptionHandling3.callerMethod();
//	}catch(Exception e){
//		throw new UserDefineException("from caller method");
//	}
	
	
	//7.....
	CallerClass callerClass=new CallerClass();
	
	try {
		callerClass.callerClass();
		}
		catch(Exception e) {
			throw new UserDefineException("from caller class");
		}

}
public void checkedException() throws FileNotFoundException {
	FileInputStream fileInputStream=new FileInputStream("home/hgds/nbvc");
		
}
public void userDefineException() throws UserDefineException{
	int marks=32;
	if(marks<32) {
		try {
			throw new UserDefineException("invalid marks for passing");
		}
			catch(UserDefineException e) {
				System.err.println(e.getMessage());
		}
	}
	else {
		System.out.println("your are pass");
	}

}
public void fromCatch() throws UserDefineException {
	int marks[]=null;
	
		try {
			System.err.println(marks.length);
		}
			catch(NullPointerException e) {
//				System.err.println(e.getMessage());
				throw new UserDefineException("Cannot read the array length because  marks is null");
		}
}
public void nestedTryBlock() throws UserDefineException {
	int intArray[]= {1,2,3,4,5};
	 try {
			int result=intArray[6];
		    }
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("array");
//			e.printStackTrace();
//			throw new UserDefineException("Index 6     out of bounds for length 5     ");
		}
	 
	 try {
			System.out.println(intArray[0]/0);
			}
			catch(ArithmeticException e) {
				System.out.println("Arithmetic Exception");
//				throw new UserDefineException("");
			}
		
		
		
		}
public void reThrowFromCatch() {
	int intArray[]= {1,2,3,4,5};
	try {
		System.out.println(intArray[0]/0);
		}
		catch(ArithmeticException e) {
			throw e;
		}
}

public void callerMethod() {
	int intArray[]= {1,2,3,4,5};
		System.out.println(intArray[0]/0);
		
}
}
class CallerClass{
public void callerClass() throws UserDefineException {
	int intArray[]=null;
	System.err.println(intArray.length);
	
}
}


