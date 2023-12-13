package com.org.lambda7;

public class ImplementationClass {
	public static void main(String[] args) {
		Interface1 i=(x,y)->
		{ return x+y;};
		int res=i.add(10,20);
		System.out.println(res);
	}

}
