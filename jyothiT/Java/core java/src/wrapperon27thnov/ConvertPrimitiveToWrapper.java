package wrapperon27thnov;

public class ConvertPrimitiveToWrapper {
	
	static void convert()
	{
//		Boxing
		Integer integer=new Integer(10);
//		Unboxing8
		int intValue=integer;
		
		Byte byte1=20;
		byte byteValue=byte1;
		
		Short short1=6;
		short shortValue=short1;
		
		Long long1=722827l;
		long longValue=long1;
		
		Float float1=new Float(20.29f);
		float floatValue=float1;
		
		double double1=12018.99;
		double doubleValue=double1;
		
		Character character='h';
		char charValue=character;
		
		Boolean boolean1=true;
		boolean booleanValue=boolean1;
		 

	}
	
	public static void main(String[] args) {
		     
		convert();
		
	}

}
