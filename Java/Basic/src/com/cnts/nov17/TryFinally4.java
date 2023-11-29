package com.cnts.nov17;

public class TryFinally4
{
	public static void main(String[] args) {
		int[] array = new int [5];
		try
		{
			System.out.println(array[10]);
		}
		/*
		 * we can write the try-finally block
		 * but after the exception occuered it will not be handeled
		 * but finally blok will execut
		 * */
	finally
		{
			System.out.println("finally block");
			
		}
	}
}
