package com.crnts.Classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.crnts.InterfacesException.P2Interface;

public class P5Class implements P2Interface {

	public static void main(String[] args) throws FileNotFoundException {
		P5Class p5Class=new P5Class();
		try {
		p5Class.rethrowThrows();
		System.out.println("File found");
	} catch (FileNotFoundException e) {
//		e.getStackTrace();
//		System.out.println("Exception Handled in inner catch");
//		try {
//			p5Class.rethrowThrows();
//			System.out.println("File found ");
//		}
//		catch (FileNotFoundException e1) {
//			System.out.println("Exception Handled in outter catch");
//			e1.getStackTrace();
//		}
		throw new  FileNotFoundException();
		

	}

	}
	public void rethrowThrows() throws FileNotFoundException {
		FileInputStream fileInputStream=new FileInputStream("/Users/Rakhi Mandal/Desktop/pr.txt");
	
	}

}
