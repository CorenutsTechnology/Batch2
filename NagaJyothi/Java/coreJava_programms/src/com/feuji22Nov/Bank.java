package com.feuji22Nov;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Bank 
{
	/*
	 * parent class does not declare exception but sub class declare checked
	 * exception we will get compile error. public void intrest() {
	 * System.out.println("2 rs intrest in bank"); }
	 */
	
	
	/*
	 * parent class does not declare any exception but sub class declare run time
	 * exception we will get run time error .
	 */
	public void intrest(){
	  System.out.println("2 rs intrest in bank"); }
	 
	
	/*
	 * parent class declare runtimeexception but child class declare checked
	 * exception then we will get compile time error. public void intrest() throws
	 * RuntimeException { System.out.println("2 rs intrest in bank"); }
	 */
	
	/*
	 * parent class declare runtimr exception but child class declare subclass of
	 * runtime exception the we will get runtime exception public void intrest()
	 * throws RuntimeException { System.out.println("2 rs intrest in bank"); }
	 */
     
	/*
	 * public void intrest() throws RuntimeException { int c=10/0;
	 * System.out.println("2 rs intrest in bank"); }
	 */

     
     
}
