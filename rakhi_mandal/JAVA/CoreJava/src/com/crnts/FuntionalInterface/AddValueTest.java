package com.crnts.FuntionalInterface;

public class AddValueTest {

	public static void main(String[] args) {
		AddValues  add=(value1,value2)-> {
			int result =value1+value2;
			return result;
		};
		System.out.println(add.addition(17,7));
		
//		------------------------------------------
//		Print1To10 print=()->{
//			for(int index=0;index<=10;index++)
//			{
//				System.out.println(index);
//			}
//		};
//		print.printValues();
		
		
		
	}

}
