package day_27_11_23_Assignment;

public class Q4_NumberFormatException {

	public static void main(String[] args) {
		String stringValue2="v100";
		
		int intValue2=Integer.parseInt(stringValue2);
		System.out.println(intValue2); //NumberFormatException
	}

}
