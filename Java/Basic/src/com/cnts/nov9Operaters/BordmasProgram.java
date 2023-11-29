package com.cnts.nov9Operaters;

public class BordmasProgram {

	public int bordmas(int value1,int value2)
	{
		System.out.println("BordmasProgram::bordmas::value1= "+value1+" value2= "+value2);
		int result=((value1/value2 + value2*value1)-value1 );
		System.out.println("END");
		return result;
	}
	
	public static void main(String[] args) {
		BordmasProgram bordmasProgram = new BordmasProgram();
		System.out.println("Result="+bordmasProgram.bordmas(8, 2));
	}
}
