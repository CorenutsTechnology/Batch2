//20-11-23
package com.crnts.Classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.crnts.InterfacesException.P1Interface;

public class P1Class implements P1Interface {

//---------------METHODS--------------------------------
	
//------------Using throws keyword------------P1
	@Override
	public void checkedExceptionThrows() throws FileNotFoundException {
		FileInputStream fileInputStream=new FileInputStream("/Users/Rakhi Mandal/Desktop/pro.txt");
	
	}

//---------Using throw keyword---------------P1
	@Override
	public int checkedExceptionThrow(int age) throws Exception {
		if(age<18)
		{
			throw new Exception("Not eligible for voting");
		}
		else
			System.out.println("You are eligible:"+ age);
		return age;
		
	}

//----------User defined exception-------------P2
	@Override
	public int userDefinedException(int marks)  throws Exception
	{ if(marks<=30)
	throw new MarkSheet("Not qualified");
	
	return marks;
	}
	
//	----------User defined exception in catch-----------P3
	
	@Override
	public double userDefinedExceptionInCatch(double principal,double rate,double time)  throws RuntimeException
	{ 
		if(principal<=0)
			throw new simpleInterest("Principle cannot be less than or equal to 0");
		else if(rate<=0)
			throw new simpleInterest("rate of interest cannot be less than or equal to 0");
		else if(time<=0)
			throw new simpleInterest("time cannot be less than or equal to 0");
		
		double result =(principal*rate*time)/100;
		return result;
	}
	
	
	}


	


