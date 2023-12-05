package com.crnts.Test;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;

import com.crnts.Classes.P1Class;
import com.crnts.Classes.simpleInterest;

class P1Test {
	P1Class p1Class=new P1Class();
	@Test
	public void program1() 
	{
		//------------exception	with throw keyword----P1
//		try {
//			p1Class.checkedExceptionThrows();
//			System.out.println("File found");
//		} catch (FileNotFoundException e) {
		
//			System.out.println("Exception Handled");
//	
//		}
		
//		------------exception	with throw keyword----P1
//		p1Class.checkedExceptionThrow(90);
	}
	
	@Test
	public void program2()
	{
//		//------------User Defined exception---------P2
//		try {
//			p1Class.userDefinedException(10);
//			System.out.println("You are qualified");
//		} catch (Exception e) {
//			System.out.println("You are not qualified");
//			System.out.println("User defined Exception handled in try catch");
//		}
	}
	
	@Test
	public void program3()
	{
//		---------User Defined exception in catch block-----P3
//		try {
//			p1Class.userDefinedExceptionInCatch(0, 10, 90);
//		} catch (simpleInterest e ) {
//			System.out.println(e.getMessage());
//			
//		}
	}
	
	@Test
	public void program4()
	{
//		--------Nested try------------------P4
		try {
		p1Class.userDefinedException(90);
		System.out.println("You got  qualified marks");
		try {
		p1Class.checkedExceptionThrows();
		System.out.println("File found");
	} catch (FileNotFoundException e) {
		System.out.println("Exception Handled in inner catch");
	
	}
		
	} catch (Exception e) {
		System.out.println("You didn't got  qualified marks");
		System.out.println("Exception Handled in outter catch");
	}
	}
	

}
