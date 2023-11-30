package exceptionHandling_17_9;

import java.io.IOException;

public class XY

{

	void myMethod() 

	{

		System.out.println("ONE");

	}

	void myMethod() throws NumberFormatException

	{

		System.out.println("TWO");

	}

	void myMethod() throws ArrayIndexOutOfBoundsException

	{

		System.out.println("THREE");

	}

}
