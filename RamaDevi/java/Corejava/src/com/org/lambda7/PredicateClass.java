package com.org.lambda7;

import java.util.function.Predicate;

public class PredicateClass {
	
	public static void main(String[] args) {
		Predicate<String> predic=(v)->
		{
			if("test".equalsIgnoreCase(v))
			{
				return true;
			}
			return false;
		};
		System.out.println(predic.test("test"));
	}

}
