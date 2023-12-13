package com.org.functionalinter8;

import java.util.function.Consumer;
import java.util.function.Function;

public class DisplayNumber {

	public static void main(String[] args) {
		Consumer <Integer>con=(value)->
		
		//PrintNumInterface numPrint=(value)->
		{
			for(int i=1;i<=value;i++)
			{
			System.out.println(i);
			}
			 
		};
		con.accept(10);
		//numPrint.displayNum(10);
	}

	
}
