package com.feuji8dec;

import com.feuji7dec.Caluclate;

public class CaluclationsClass 
{
	public CaluclationsClass()
	{
		
	}
	 public static int multiplications(int a,int b)
	 {
		 int result=a*b;
		 return result;
	 }
	 public int addition(int a,int b)
	 {
		 int res=a+b;
		 return res;
	 }
	 public static void main(String[] args) 
	 {
		 Caluclations cal=CaluclationsClass::multiplications;
		int s= cal.multiplication(10, 20);
		System.out.println(s);
		
//		CaluclationsClass caluclation=new CaluclationsClass();
//		Caluclate res=caluclation::addition;
//		int add=res.caluclate(10, 20);
//		System.out.println(add);
		
		 //Caluclate res=CaluclationsClass::new 
	 }

}
