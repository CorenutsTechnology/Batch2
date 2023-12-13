package com.feuji14nov;

import com.feujitest14nov.AssendingNDesending;

public class AssendingNDesendingNo
{
	public static void main(String[] args) 
	{
		AssendingNDesending result=new AssendingNDesending();
		int[] assending=result.assendingOrder(new int[]{31,23,45,67,87});
		System.out.println("Assending order");
		for(int i=0;i<=assending.length-1;i++)
		{
			System.out.println(assending[i]);
		}
		int[]desending=result.desendingOrder(new int[] {31,23,45,67,87});
		System.out.println("desending order");
		for(int i=0;i<=desending.length-1;i++)
		{
			System.out.println(desending[i]);
		}
	}

}
