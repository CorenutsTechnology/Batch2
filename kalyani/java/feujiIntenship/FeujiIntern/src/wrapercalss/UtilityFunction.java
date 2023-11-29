package wrapercalss;

import constractor.Parent;

public class UtilityFunction {

	

	public static void main(String[] args) {
		int value=100;
		Integer  integerObj=new Integer(value);
		System.out.println(integerObj);
		Integer integerObj1=value;
		System.out.println(integerObj1);
		Integer  integerObj2=new Integer(200);
		System.out.println(integerObj2);
		Integer integerObj3=Integer.valueOf(value);
		System.out.println(integerObj3);
		System.out.println(Integer.parseInt("300"));
		

int valueFormObj = integerObj2;
System.out.println(valueFormObj);
Integer.valueOf(valueFormObj);
System.out.println(valueFormObj);
Number LongObj= new Long(500);
System.out.println( LongObj);
Number Double=new Double(600.00);
System.out.println(Double);
System.out.println(new Double(234.67).longValue());
Character character=Character.valueOf('k');
System.out.println(character);
Boolean boolean1=new Boolean(true);
System.out.println(boolean1);


	}
}