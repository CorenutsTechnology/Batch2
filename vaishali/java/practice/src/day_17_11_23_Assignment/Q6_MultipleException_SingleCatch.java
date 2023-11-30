package day_17_11_23_Assignment;

public class Q6_MultipleException_SingleCatch {

	public static void main(String[] args) {
		int intArray[]= {3,6,8};
		try {
			System.out.println(intArray[5]);
			System.out.println(12/0);
		}
		catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println("Exception : "+e);
		}
	}

}
