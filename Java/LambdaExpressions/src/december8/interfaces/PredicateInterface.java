package december8.interfaces;

import java.util.function.Predicate;

public class PredicateInterface
{

//	@Override
//	public boolean isEven(int value)
//	{
//		return (value%2==0)?true:false;
//	}---->valid
	
//	 static EvenorNot e = (a)->{
//		return (a%2==0)?true:false;
//	}; ---->valid
	
	
	public static void main(String[] args) 
	{
//		System.out.println(new MainClass().isEven(15));
		System.out.println("Predicate Hello");
		Predicate<Integer> p = (Integer t)->{
			return (t%2==0)?true:false;
		};
		
		System.out.println(p.test(10));
	}
}
