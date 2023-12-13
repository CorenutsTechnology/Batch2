package com.feuji7dec;

import java.util.function.Function;
import java.util.function.Predicate;

public class NumIsEvenOrOddImplementation /* implements NumIsEvenOrOdd */
{

//	@Override
//	public boolean check(int number) {
//		if(number%2==0)
//		{
//			return true;
//		}
//		return false;
//	}
	public static void main(String[] args) 
	{
//		NumIsEvenOrOddImplementation result=new NumIsEvenOrOddImplementation();
//		 boolean  b=result.check(6);
//		 System.out.println(b);
		 
//		 NumIsEvenOrOdd num=(number)->{
//			 if(number%2==0)
//			 {
//				 return true;
//			 }
//			 return false;
//		 };
//		 boolean  b=num.check(6);
//		 System.out.println(b);
		 //predicate methos give boolean result as an output
		 Predicate<Integer> even=(number)->
		 {
			 if(number%2==0)
				 return true;;
			 return false;
		 };
		 System.out.println(even.test(6));
		 
		 
  }
		 
	
	
  
}
