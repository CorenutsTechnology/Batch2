package com.cnts.Strings_24;
//program 7
import java.util.StringTokenizer;

public class SplitAndDisplay {
	public static void main(String[] args) {
		//constructor1 StringTokenizer(String str): default delimiters like newline, space, tab, carriage return, and form feed.
		StringTokenizer stringTokenizer = new StringTokenizer("CoreNuts Technologies Pvt ltd."," ");
		
		while(stringTokenizer.hasMoreTokens()) {
			System.out.println(stringTokenizer.nextToken());
		}
		
		//constructor2  StringTokenizer(String str, String delim):  delim is a set of delimiters that are used to tokenize the given string.
		StringTokenizer st2 = new StringTokenizer(
	            "CoreNuts : Technologies : Pvt : ltd",":");
		 while (st2.hasMoreTokens()) {
			 System.out.println(st2.nextToken());
		 }
	//constructor3 StringTokenizer(String str, String delim, boolean flag): The first two parameters have the same meaning wherein The flag serves the following purpose.
	StringTokenizer st3 = new StringTokenizer(
			"CoreNuts : Technologies : Pvt : ltd"," : ", true);
 
        while (st3.hasMoreTokens())
            System.out.println(st3.nextToken());
    }

}
