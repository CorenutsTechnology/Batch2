package com.cnts.operator;

public class BitwiseOperator {

	public static void main(String[] args) {
		BitwiseOperator BitwiseOperator=new BitwiseOperator();
		BitwiseOperator.bitwiseAnd(10, 20);
		BitwiseOperator.logicalAnd(20, 10);
	}
	
		public boolean bitwiseAnd(int value1, int value2) {
			boolean result=((value1>value2)&value1<10);
			System.out.println("bitwiseAnd result"+result);
			return result;
		}
		public boolean logicalAnd(int value1, int value2) {
			boolean result=((value1>value2)&&value1>10);
			System.out.println("logicaland result"+result);
			return result;
		}


	}


