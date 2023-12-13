package operators;

public class OperatorPrecedence {
	
	public static void main(String[] args)
	{
		//Arithmetic operators
		double result=2+3*5/2.0-1;
		System.out.println(result);
		
		//Comparison operators
		boolean compare=10>5+2&&5<8;
		System.out.println(compare);
		
		//Logical operators
		boolean logicalResult= true&&false||!true;
		System.out.println(logicalResult);
		
		//Bitwise operators
		int bitwiseResult=10 & 6 | 3;
		System.out.println(bitwiseResult);
		
		//Assignment operator
		int x=5;
		x+=3*2;
		System.out.println(x);
	}

}
