package com.org.ExceptionOverride22;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Vehicle {
	public Vehicle drive() throws IOException {
		System.out.println("vehicle drive");
		return new Vehicle();
	}

	public void feul() {
		System.out.println("feul in vehicle");
	}
	
}
