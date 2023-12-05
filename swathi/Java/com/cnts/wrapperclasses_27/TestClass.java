package com.cnts.wrapperclasses_27;

import org.junit.jupiter.api.Test;

public class TestClass {
	@Test
	public void wrapperTestClass(){
		 WrapperClass  wrapperClass = new  WrapperClass();
		 wrapperClass.primitiveToWrapper();
		 wrapperClass.wrapperToPrimitive();
		 wrapperClass.wrapperMethods();
		 	
	}
	@Test
	public void checkNumberIsString() {
		 WrapperClass  wrapperClass = new  WrapperClass();
		if(wrapperClass.isNumber("swathi")) {
			System.out.println("The given String input is a number");
	
		}
		else {
			System.out.println("The given input String is string");
		}
	}
}
