package com.crnts.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.crnts.Classes.P5Class;

class P5Test {

	

	@Test
	void testProgram5() throws FileNotFoundException {
		P5Class p5Class=new P5Class();
		try {
		p5Class.rethrowThrows();
		System.out.println("File found");
	} catch (FileNotFoundException e) {
		
		System.out.println("Exception Handled in inner catch");
		throw new  FileNotFoundException();
		

	}
	}

}
