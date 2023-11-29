package com.crnuts.test;

import com.crnuts.impleClass.SimpleIntrestOperation;
import com.crnuts.impleClass.SimpleIntrestException;

public class SimpleIntrestTest {

	public static void main(String[] args) {
		SimpleIntrestOperation simpleIntrest=new SimpleIntrestOperation();
		
		
		try {
			simpleIntrest.operation(0, 45, 89);
		} catch (SimpleIntrestException e) {
			System.out.println(e.getMessage());
		}

	}

}
