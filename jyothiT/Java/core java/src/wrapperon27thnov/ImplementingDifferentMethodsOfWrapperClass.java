package wrapperon27thnov;

public class ImplementingDifferentMethodsOfWrapperClass {
	
	static void wrapperMethods()
	{
		Character charValue='A';
		
		
		String stringValue=charValue.toString();
		System.out.println(stringValue);
		
		int intValue=charValue.charValue();
		System.out.println(intValue);
		
        boolean booleanValue=charValue.equals(stringValue);
        System.out.println(booleanValue);
        
        System.out.println(Byte.valueOf("10101", 2));
        System.out.println(Double.parseDouble("101"));
        System.out.println(Integer.parseInt("191"));
		
	}
	
	public static void main(String[] args) {
		
		wrapperMethods();
		
//		Integer intValue=new Integer(10);
//		System.out.println(Integer.valueOf(intValue));
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Integer.SIZE);
//		System.out.println(Integer.max(20, 10));
//		System.out.println(Integer.min(20, 10));
//		System.out.println(Integer.parseInt("726"));
//        
//        
//        Double double1=new Double(10282.88);
//        System.out.println(Double.parseDouble("1010.89"));
//        System.out.println(Double.isNaN(10.9));
//        System.out.println(Double.MIN_NORMAL);
//        System.out.println(Double.POSITIVE_INFINITY);
//        System.out.println(Double.NEGATIVE_INFINITY);
//        
	}

}
