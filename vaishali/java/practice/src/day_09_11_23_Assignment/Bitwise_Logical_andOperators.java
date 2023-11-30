package day_09_11_23_Assignment;

public class Bitwise_Logical_andOperators{
	
	public int bitwiseAND(int value1,int value2) {
		int result=value1&value2;
		System.out.println("bitwiseAND result : "+result);
		return result;
	}
	
	public boolean logicalAnd(int value1,int value2) {
		boolean result=(value1<value2)&&(value1>=value2);
		System.out.println("logicalAnd result : "+result);
		return result;
	}
}
