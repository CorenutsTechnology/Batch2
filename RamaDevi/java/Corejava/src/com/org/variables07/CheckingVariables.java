package com.org.variables07;

public class CheckingVariables {
static String NAME="rama";
byte byteValue=3;
short shortValue=6;
int intValue=10;
long longValue=8773;
float floatValue=10.9f;
double doubleValue=2;
char charValue='d';
boolean booleanValue=true;
public static void calculateSum(int value1,int value2)
{
	int calculatedSum=value1+value2;
	System.out.println(calculatedSum);
}
public  void calculateSum1(int value1,int value2)
{
	System.out.println(NAME);
	int calculatedSum=value1+value2; 
}
	public static void main(String[] args) {
		int localVar=10;
		String name="bhanu";
		System.out.println(localVar);
		System.out.println(name);
		System.out.println(CheckingVariables.NAME);
	
		CheckingVariables cv=new CheckingVariables();
		
		System.out.println(cv.byteValue);
		System.out.println(cv.shortValue);
		System.out.println(cv.intValue);
		System.out.println(cv.longValue);
		System.out.println(cv.floatValue);
		System.out.println(cv.doubleValue);
		System.out.println(cv.charValue);
		System.out.println(cv.booleanValue);
		
		CheckingVariables.calculateSum(3,2);
		cv.calculateSum1(4, 3);
				
	}

}
