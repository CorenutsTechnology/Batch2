package day_09_11_23_Assignment;

import javax.management.openmbean.OpenDataException;

public class ArithmeticOperators {
	
	public int  addition(int value1,int value2) {
		int result=(value1+value2)+(value1+10);
		System.out.println("addition value : "+result);
		return result;
	}
	
	public double substraction(double value1,double value2) {
		double result=(value1+value2)-(value1-value2);
		System.out.println("substraction value : "+result);
		return result;
	}
	
	public double multiplication(double value1,double value2) {
		double result=value1*value2;
		System.out.println("multiplication value : "+result);
		return result;
	}
	
	public int division(int value1,int value2) {
		int result=value1/value2;
		System.out.println("division value : "+result);
		return result;
	}
	
	public double division1(int value1,double value2) {
		double result=value1/value2;
		System.out.println("division1 value : "+result);
		return result;
	}
	
	public double division2(double value1,double value2) {
		double result=value1/value2;
		System.out.println("division2 value : "+result);
		return result;
	}
	
	public int modulus(int value1,int value2) {
		int result=value1%value2;
		System.out.println("modulus value : "+result);
		return result;
	}
	
	public double modulus1(int value1,double value2) {
		double result=value1%value2;
		System.out.println("modulus1 value : "+result);
		return result;
	}
	
	public double modulus2(double value1,double value2) {
		double result=value1%value2;
		System.out.println("modulus2 value : "+result);
		return result;
	}
	
}
