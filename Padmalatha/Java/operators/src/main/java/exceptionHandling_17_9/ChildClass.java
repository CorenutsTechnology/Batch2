package exceptionHandling_17_9;

import java.io.IOError;

class BaseClass {
	 void method1() {
	 System.out.println("Base Class Method 1");
	 }
	 }
public class ChildClass {

	
	  protected void method1() throws IOError {
	  
	  System.out.println("Child Class Method 1"); 
	  //throw new IOError(null);
	  
	  }
	 
		 public static void main(String[] arg) {
		 
				/*
				 * int value1 = 100;
				 *  byte value2 = 200; 
				 * //byte range -128 to 127 
				 * short value3 =300; 
				 * double value4 = 400.0;
				 * 
				 * System.out.print(value1 < value2 ? value4 > value3? "hai": "hello": "false");
				 */
			 
			      

		 
		 }
}
