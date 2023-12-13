package com.org.functionalinter8;

public class EvenOrOdd { 


//	@Override
//	public boolean evenOrOdd(int number) {
//		if(number%2==0)
//		{
//			return true;
//		}
//		return false;
//	}
	public static void main(String[] args) {
		EvenOrOdd check=new EvenOrOdd();
//		boolean result=check.evenOrOdd(5);
//		System.out.println(result);
		
		MyInterfaceCheckEO interfac=(number)->
		{
			if(number%2==0)
			{
				return true;
			}
			return false;
		};
		System.out.println(interfac.evenOrOdd(5));
	}
	


}
