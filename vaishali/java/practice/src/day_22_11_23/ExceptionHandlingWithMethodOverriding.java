package day_22_11_23;

import javax.imageio.IIOException;

public class ExceptionHandlingWithMethodOverriding {

	public static void main(String[] args)  {
		SuperClass subClass=new SubClass();
		subClass.arithmetic(12, 10);
	}
}
