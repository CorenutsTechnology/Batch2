package day_22_11_23;

import java.io.IOException;

import javax.imageio.IIOException;

public class SubClass extends SuperClass {

//	If SuperClass doesn’t declare any exception and subclass declare checked exception : will get
//	compile time error
	
//	@Override
//	public void arithmetic(int value1, int value2) throws IIOException {
//		System.out.println("sub class : "+(value1*value2));
//	}
	
	
//	If SuperClass doesn’t declare any exception and SubClass declare Unchecked exception :it works 
	
//	public void arithmetic(int value1, int value2) throws ArithmeticException {
//		System.out.println("sub class : "+(value1/value2));
//	}
	
	
//	Case 3: If SuperClass declares an exception and SubClass declares exceptions other than the
//	child exception of the SuperClass declared Exception : it works for unchecked exception

//	public void arithmetic(int value1, int value2) throws ArrayIndexOutOfBoundsException {
//		System.out.println("sub class : "+(value1/value2));
//	}
	
	
//	Case 4: If SuperClass declares an exception and SubClass declares a child exception of the SuperClass
//	declared Exception : it  work for unchecked exception

//	public void arithmetic(int value1, int value2) throws ArithmeticException{
//		System.out.println("sub class : "+(value1/value2));
//	}

	
//	If SuperClass declares an exception and SubClass declares without exception :it work for unchecked exception

	public void arithmetic(int value1, int value2) {
		System.out.println("sub class : "+(value1/value2));
	}

	
	
}
