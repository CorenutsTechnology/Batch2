package day_27_11_23_Assignment;

public class Q3_StringToPrimitive {

	public static void main(String[] args) {
		
		String stringValue="100";
		int intValue=Integer.parseInt(stringValue);
		System.out.println("integer value - "+intValue);
		
		String stringValue2="20";
		byte byteValue=Byte.parseByte(stringValue2);
		System.out.println("byte value - "+byteValue);
		
		short shortValue=Short.parseShort(stringValue2);
		System.out.println("short value - "+shortValue);
		
		long longValue=Long.parseLong(stringValue);
		System.out.println("long value - "+longValue);
		
		String stringValue3="56.7";
		float floatValue=Float.parseFloat(stringValue3);
		System.out.println("float value - "+floatValue);
		
		double doubleValue=Double.parseDouble(stringValue);
		System.out.println("double value - "+doubleValue);
		
		boolean booleanValue=Boolean.parseBoolean(stringValue);
		System.out.println("boolean value1 - "+booleanValue);
		
		System.out.println("boolean value2 - "+Boolean.parseBoolean("false"));
		
		System.out.println("boolean value3 - "+Boolean.parseBoolean("true"));
		
		System.out.println("boolean value4 - "+Boolean.parseBoolean("hi"));
	}

}
