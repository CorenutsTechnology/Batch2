package com.feuji11dec;

import java.util.function.BiFunction;

public class CaluclatorClass 
{
	public static void main(String[] args) {
		Caluclator c=new Caluclator();
		 BiFunction<Integer, Integer, Integer> res1=c::addition;
		 res1.apply(10, 20);
		 BiFunction<Integer, Integer, Integer> res2=c::multiplication;
		 res2.apply(10, 20);
	}

}
