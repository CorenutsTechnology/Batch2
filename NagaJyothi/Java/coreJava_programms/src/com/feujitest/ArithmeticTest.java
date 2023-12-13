package com.feujitest;



import com.feuji9nov.ArithmeticOperators;

public class ArithmeticTest

{
		ArithmeticOperators arithmetic= new ArithmeticOperators();
		public void additionTest() 
		{
			int res=arithmetic.addition(10, 20);
			
		}
		public void subtractionTest()
		{
			int res1=arithmetic.subtraction(30, 20);
		}
		public void multiplicationtest()
		{
			int res2=arithmetic.multiplication(20, 40);
		} 
		public void divisionTest()
		{
			double res3=arithmetic.division(10,100);
		}
		public void modularTest()
		{
			double res4=arithmetic.moduler(5, 10);
		}
		public void operationTest()
		{
			int res5=arithmetic.operation(5, 5);
		}

		/*
		 * public void increementTest() { int res5=arithmetic.increment(10, 11);
		 * System.out.println(res5); } public void decrementTest() { int
		 * res6=arithmetic.decrement(5); System.out.println(res6); }
		 */
		public static void main(String[] args) 
		{
			ArithmeticTest arithmeticTest=new ArithmeticTest();
			arithmeticTest.additionTest();
			arithmeticTest.subtractionTest();
			arithmeticTest.multiplicationtest();
			arithmeticTest.divisionTest();
			arithmeticTest.modularTest();
			arithmeticTest.operationTest();
			
			/*
			 * arithmeticTest.increementTest(); arithmeticTest.decrementTest();
			 */
			
		}
		
	
	

}
