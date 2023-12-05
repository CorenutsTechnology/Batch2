package com.crnts.Classes;

public class P7HandleException {

	public static void main(String[] args) {
		P7Class p7Class=new P7Class();
		try {
		p7Class.handleExceptionInOtherClass();
		}catch(NullPointerException e)
		{  	System.out.println(e.getMessage());
			System.out.println("Exception handled in caller class");
		
		}

	}

}
