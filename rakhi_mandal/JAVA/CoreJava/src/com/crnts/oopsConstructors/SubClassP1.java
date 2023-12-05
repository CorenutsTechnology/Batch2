package com.crnts.oopsConstructors;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SubClassP1 extends SuperClassP1 {
	public static void main(String[] args) {
		SubClassP1 subClassP1=new SubClassP1();
//		subClassP1.display2(5);
//		subClassP1.display3(5);
//		subClassP1.display4(5);
		subClassP1.display5(5);
	}
	
	
	//CTE-Case 1-----------
//	public void display1() throws FileNotFoundException   {
//	FileInputStream fileInputStream=new FileInputStream("/Users/Rakhi Mandal/Desktop/pr.txt");
//	
//}
	//Runtime Exception Case 2----------- 
//	void display2(int value1)
//   {  
//		int result=value1/0;
//		System.out.println(result);
//		}
	
	// Runtime Exception Case 3-----------
//	void display3(int value1) throws ArithmeticException
//  {  
//		int result=value1/0;
//		System.out.println(result);
//		}
   //No exception if handled Case 4------------
//	void display4(int value1) throws ArithmeticException
//	  {  
//			int result=value1/0;
//			System.out.println(result);
//			}
	
	   //No exception if handled Case 5------------
	void display5(int value1) 
	  {  
			int result=value1/0;
			System.out.println(result);
			}
	
	}
