package com.crnt.assaignment.nov13;

public class ReverseTrianglePattern {
	public static void main(String[] args) {
		int size=5;
		for (int index1=0 ; index1<size ;index1++)
		{
			for (int index2=0;index2<size-index1 ; index2++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
