package com.crnts.InterfacesException;

import java.io.FileNotFoundException;

import com.crnts.Classes.simpleInterest;

public interface P1Interface {

//---------P1----------
	void checkedExceptionThrows()throws FileNotFoundException;
	int checkedExceptionThrow(int age) throws Exception;
	
	
//-------P2------------	
	int userDefinedException(int marks) throws Exception;
//---------P3---------
	double userDefinedExceptionInCatch(double principal, double rate, double time) throws simpleInterest, Exception;
}
