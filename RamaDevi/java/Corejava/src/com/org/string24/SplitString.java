package com.org.string24;

public class SplitString {

	public static void main(String[] args) {
		String name = "Corenuts Technologies Pvt Ltd";
		String []string=name.split(" ");
		for(int index=0;index<string.length;index++)
		{
			System.out.println(string[index]);
		}

	}

}
