package com.cnts.nov20;

public class ReThrow_5 
{
	
	public static void main(String[] args) {
		try {
			String string = "CoreNuts and Feuji";
			char charecter = string.charAt(20);
			System.out.println(charecter);
			System.out.println();
		} 
		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBoundsException Occured");
			System.out.println(e.getMessage());
			throw new StringIndexOutOfBoundsException("re-throw the exception");
		}
	}
}
