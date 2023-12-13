package com.feuji11dec;

public class MainTest
{
	public static void main(String[] args) {
		
//		Caluclate result=(a,b)->{
//			int result1 =a+b;
//			System.out.println(result1);
//			return result1;
//		};
		//result.sum(10, 20);
		Math math=new Math();
		Caluclate cal=math::sum;
		cal.sum(30, 40);
		
	
		
	}
//public int sum(int a,int b)
//{
//	int c=a+b;
//	System.out.println(c);
//	return c;
//}
}
