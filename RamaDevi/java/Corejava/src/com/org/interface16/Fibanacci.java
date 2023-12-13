package com.org.interface16;

public class Fibanacci {
public void fibanacciPattern()
{
	int firstValue=0;
	int secondValue=1;
	int thirdValue;
	for(int index=1;index<=index;index++) {
		System.out.print(firstValue);
	
		thirdValue=firstValue+secondValue;
		firstValue=secondValue;
		secondValue=thirdValue;
		
	}
}
	public static void main(String[] args) {
		Fibanacci fibannci=new Fibanacci();
		for(int outer=1;outer<=5;outer++)
		{
			for(int inner=1;inner<=5;inner++)
			{
				fibannci.fibanacciPattern();
			}
			System.out.println();
		}

	}

}
