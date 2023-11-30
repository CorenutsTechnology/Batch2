package day_27_11_23_Assignment;

public class Q5_StringOrNumber {

	public static void main(String[] args) {
		String stringValue="29v";
		try {
			double doubleValue=Double.parseDouble(stringValue);
			System.out.println(stringValue+" is Number");
		}
		catch (NumberFormatException e) {
			System.out.println(stringValue+" is String");
		}
		
	}

}
