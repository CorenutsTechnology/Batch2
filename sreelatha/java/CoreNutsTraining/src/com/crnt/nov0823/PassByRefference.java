package com.crnt.nov0823;

public class PassByRefference {
	public static void main(String[] args) {
		int [] value = {2,5,4};
		
		System.out.println(value[2]);
		PassByRefference.test(value);
		System.out.println(value[2]);
		
	}
	public static void test(int[] value)
	{
		value[2]=7*2;
		System.out.println(value[2]);
	}

}
