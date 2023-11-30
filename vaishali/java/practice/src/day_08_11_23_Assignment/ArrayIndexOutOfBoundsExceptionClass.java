package day_08_11_23_Assignment;

public class ArrayIndexOutOfBoundsExceptionClass {

	public static void main(String[] args) {
		ArrayIndexOutOfBoundsExceptionClass arrayclass=new ArrayIndexOutOfBoundsExceptionClass();
		arrayclass.exceptionMethod();
	}

	public void exceptionMethod() {
		int[] intArray=new int[3];
		intArray[0]=2;
		intArray[1]=3;
		intArray[2]=6;
		System.out.println(intArray[2]);
//		System.out.println(intArray[6]); //ArrayIndexOutOfBoundsException
	}
}
