package com.week9.assigenments;

public class PyramidPattern 
{
	public static void main(String[] args) 
	{
		int space=4;
		int star=1;
		for(int index=1;index<=5;index++)
		{
			for(int index2=1;index2<=space;index2++)
			{
				System.out.print(" ");
			}
			space--;
			for(int index3=1;index3<=star;index3++)
			{
				System.out.print("* ");
			}
			star++;
			System.out.println();
		}
		
	}

}
