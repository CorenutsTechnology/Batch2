package com.feuji8nov;

import java.util.Iterator;

public class MultiDimensionalArray 
{
	public static void main(String[] args) 
	{
		int mulArray[][]=new int[3][3];
		MultiDimensionalArray marray=new MultiDimensionalArray();
				marray.displayDetails(mulArray);
		
	}
	public void displayDetails( int[][] mulArray)
	{
		
		/*
		 * mulArray[0]=new int[3]; mulArray[1]=new int[2]; mulArray[2]=new int[2];
		 */
		mulArray[0][0]=10;
		mulArray[0][1]=20;
		mulArray[0][2]=30;
		mulArray[1][0]=40;
		mulArray[1][1]=50;
		mulArray[1][2]=60;
		mulArray[2][0]=70;
		mulArray[2][1]=80;
		mulArray[2][2]=90;
		for(int i=0;i<=mulArray.length-1;i++)
		{
		   for(int j=0;j<=mulArray.length-1;j++)
		   {
			System.out.println(mulArray[i][j]);
		   }
		}
		
		
		
	}
	

}
