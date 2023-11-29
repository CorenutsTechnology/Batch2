package com.crnt.assaignment.nov13;

public class CheckPalidromeOrNot {
	public static void main(String[] args) {
		String name = "mamo";
		String res="";
		for(int i=name.length()-1;i>=0;i--)
		{
			char c =name.charAt(i);
			res=res+c;
			System.out.println(c);

			
		}
		if (name.equals(res))
		{
			System.out.println("it is a palidrome string ..");
		}
		else
		{
			System.out.println("it is not a palidrome string ");
		}
		
	}

}
