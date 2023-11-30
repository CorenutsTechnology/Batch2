package day_09_11_23_Assignment;

public class LogicalOperators {

	public boolean and(int value1,int value2) {
		boolean result=(value1>value2)&&(value1<=value2);
		System.out.println("AND operator result : "+result);
		return result;
	}
	
	public boolean and1(int value1,int value2) {
		boolean result=(value1>value2)&&(value1++<=value2);
		System.out.println("In AND operator value1 is "+value1);
		return result;
	}
	
	public boolean and2(int value1,int value2) {
		boolean result=(value1<value2)&&(value1++<=value2);
		System.out.println("In AND operator value1 is "+value1);
		return result;
	}
	
	public boolean or(int value1,int value2) {
		boolean result=(value1>value2)||(value1<=value2);
		System.out.println("OR operator result : "+result);
		return result;
	}
	
	public boolean or1(int value1,int value2) {
		boolean result=(value1>value2)||(value1++<=value2);
		System.out.println("In OR operator value1 is "+value1);
		return result;
	}
	
	public boolean or2(int value1,int value2) {
		boolean result=(value1<value2)||(value1++<=value2);
		System.out.println("In OR operator value1 is "+value1);
		return result;
	}
	
	public boolean not(int value1,int value2) {
		boolean result=!(value1>value2)||(value1>=value2);
		System.out.println("In not operator result : "+result);
		return result;
	}
}
