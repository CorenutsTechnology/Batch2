package day_17_11_23_Assignment;

public class Q1_ExceptionHandling {

	public static void main(String[] args) {
		int intArray[]= {3,5,7,12};
		try {
			int value=intArray[5];
			System.out.println(value);
		} 
//		System.out.println("in between"); //In between try and catch we can not write any statements
		catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
			System.out.println("Exception : "+e.getMessage());
		}
//		System.out.println("bye");
	}

}
