package day_27_11_23_Assignment;

public class Q2_WrapValuesIntoWrapperClass {

	public static void main(String[] args) {
		Byte byteValue1=23;
		Byte byteValue2=new Byte((byte) 7);
		byte value1=12;
		Byte byteValue3=new Byte(value1);
		
		System.out.println("Byte value1 - "+byteValue1);
		System.out.println("Byte value2 - "+byteValue2);
		System.out.println("Byte value3 - "+byteValue3);
		
		short value2=10;
		System.out.println("Short value - "+new Short(value2));
		
		System.out.println("Integer value - "+new Integer(29));
		
		System.out.println("Long value - "+new Long(100));
		
		System.out.println("Float value - "+new Float(12.8));
		
		System.out.println("Double value - "+new Double(15));
		
		System.out.println("Character value - "+new Character('v'));
		
		System.out.println("Boolean value - "+new Boolean(true));
	}

}
