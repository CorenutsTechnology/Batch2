//7. Write a program to convert primitive to wrapper class and wrapper to primitive.
package com.wrapperclass.nov27;

public class P2W_W2P7 {

	public static void main(String[] args) 
	{
		// primitive to wrapper
		Integer i1 = 10;
		System.out.println(i1);
		// wrapper to primitive
		int i2 = Integer.valueOf(i1);
		System.out.println(i2);
		Float pi = Float.valueOf(2.54f);
		Float pi2 = new Float(2.54f);
		Float pi3 = new Float("2.54f");
	}

}
