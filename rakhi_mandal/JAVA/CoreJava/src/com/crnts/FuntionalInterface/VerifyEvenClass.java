package com.crnts.FuntionalInterface;

public class VerifyEvenClass {

	public static void main(String[] args) {
		VerifyEvenClass check=new VerifyEvenClass();
//		System.out.println(check.checkIfEven(4));
		VerifyEven v=(value)-> {
			if(value%2==0)
			return true;
			else
			  return false;
		};
		System.out.println(v.checkIfEven(17));
	}

//	@Override
//	public boolean checkIfEven(int value) {
//		if(value%2==0)
//		return true;
//		else
//		  return false;
//	}
	


}
