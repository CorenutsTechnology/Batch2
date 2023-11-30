package day_27_11_23_Assignment;

public class Q1_UtilityFunctions {

	public static void main(String[] args) {
		Q1_UtilityFunctions function=new Q1_UtilityFunctions();
		function.valueOfMethod();
		function.valueMethod();
		function.parseMethod();
		function.toStringMethod();
	}
	
	public void valueOfMethod() {
		Integer value1=Integer.valueOf("12");
		System.out.println("Integer value - "+value1);
		
		Double value2=Double.valueOf("10.3");
		System.out.println("Double value1 - "+value2);
		
		Double value3=Double.valueOf(9);
		System.out.println("Double value2 - "+value3);
		
		Character value4=Character.valueOf('v');
		System.out.println("Character value - "+value4);
	}
	public void valueMethod() {
		Integer value1=new Integer(12);
		System.out.println("Integer value - "+value1.intValue());
		Float value2=new Float(12f);
		System.out.println("Float value - "+value2.floatValue());
	}
	public void parseMethod() {
		int intValue=Integer.parseInt("29");
		System.out.println("Integer value - "+intValue);
		byte byteValue=Byte.parseByte("13");
		System.out.println("Byte value - "+byteValue);
	}
	public void toStringMethod() {
		Integer value1=new Integer(26);
		String value2=value1.toString();
		System.out.println("String value1 - "+value2);
		
		String value3=Integer.toString(4);
		System.out.println("String value2 - "+value3);
	}
}
