package com.strings.nov24;

public class StringBuffer89 {

	public static void main(String[] args) 
	{
		StringBuffer str= new StringBuffer("CoreNuts Technologies Pvt ltd");
		str.delete(8,21);
		System.out.println("after deleting "+str);
		
		str.insert(9,"Technologies ");
		System.out.println("after inserting: "+str);
	}

}
