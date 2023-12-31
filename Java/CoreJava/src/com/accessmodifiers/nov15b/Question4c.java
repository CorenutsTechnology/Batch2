package com.accessmodifiers.nov15b;

import com.accessmodifiers.nov15.Question4;

public class Question4c extends Question4
{
	public static void main(String[] args) {
		// protected members can be accessed outside of the package using inheritance
		
		
//		System.out.println("name: "+new Question4c().name); we can't access it,
		//because access level is default
		System.out.println("age: "+new Question4c().age);
	}
}
