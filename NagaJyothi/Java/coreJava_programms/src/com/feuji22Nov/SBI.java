package com.feuji22Nov;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SBI extends Bank
{
	/*we will get compile time exception.
	 * FileNotFoundException is not compatible with throws clause in Bank.intrest()
	 * public void intrest()throws FileNotFoundException {
	 * System.out.println("5 rs intrest in SBI"); }
	 */
	
	
	
	/* we will get run time error becoz we did not handled exception . */ 
	  public void intrest()throws RuntimeException 
	  {
		  //int c=10/0;
	  System.out.println("5 rs intrest in SBI"); }
	 
	
	/*
	 * we will get compiler error public void intrest()throws FileNotFoundException
	 * { int c=10/0; System.out.println("5 rs intrest in SBI"); }
	 */
	
	/*
	 * in this case we get runtime exception. becoz we did not handle the exception
	 * public void intrest()throws ArithmeticException { int c=10/0;
	 * System.out.println("5 rs intrest in SBI"); }
	 */
	
	/*
	 * public void intrest(){ //int c=10/0;
	 * System.out.println("5 rs intrest in SBI"); }
	 */
	
 public static void main(String[] args) 
 {
	 Bank result=new SBI();
	result.intrest();
	
}
}
