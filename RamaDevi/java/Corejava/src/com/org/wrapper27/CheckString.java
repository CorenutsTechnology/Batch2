package com.org.wrapper27;

public class CheckString {
	public void stringcheck() {
		try
		{
		String s1 = "ram";
		Integer val = Integer.parseInt(s1);
		
		if (val >= 0) {
			System.out.println("number");
		} else
		{
			System.out.println("string");
		}
	}
		catch(NumberFormatException e)
		{
			System.out.println("String is enterded");
		}

//System.out.println(s1.contains("ram"));
	}	

	public static void main(String[] args) {
		CheckString check = new CheckString();
		check.stringcheck();
	}

}
