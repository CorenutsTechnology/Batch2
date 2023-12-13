package com.org.MethodRef11;

public class MathMain  {
	
	public int sum(int val1, int val2) {
		int sumValue=val1+val2;
		return sumValue;
	
	}


	public static void main(String[] args) {
	Math mathobj=new Math();
//		MathMain math=new MathMain();
//		MyInterface inter=(val1,val2)->
//		{
//			int result=val1+val2;
//			return result;
//		};
//		
//		System.out.println(inter.sum(2, 6));
		
		MyInterface inte=mathobj::add;
		inte.sum(3, 4);
		
		MyInterface2 int2=mathobj::add;
		int2.sum(2,6);
		
	}

	
}
