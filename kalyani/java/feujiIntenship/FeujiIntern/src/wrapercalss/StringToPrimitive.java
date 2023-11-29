package wrapercalss;

public class StringToPrimitive {

	public static void main(String[] args) {
		int value=100;
		Integer  integerObj=new Integer(value);
		System.out.println( integerObj);
		Integer Integervalue=Integer.parseInt("200");
		System.out.println(Float.parseFloat("200"));
		Long Longvalue1=Long.parseLong("500");
		System.out.println(Longvalue1);
		Double Doublevalue=Double.parseDouble("500.0");
		System.out.println(Doublevalue);
		Boolean Booleanvalue=Boolean.parseBoolean("true");
		System.out.println(Booleanvalue);
		
	}


}
