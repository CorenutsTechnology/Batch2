package com.org.string24;

import java.util.StringTokenizer;

public class Tokenize {
public void token(StringTokenizer st)
{
	System.out.println(st.countTokens());
	System.out.println(st.hasMoreElements());
	System.out.println(st.hasMoreTokens());
	System.out.println(st.nextElement());
	//System.out.println(st.nextToken(s));

}
	public static void main(String[] args) {
		String s="hsfejdkc hde kd";
		StringTokenizer st=new StringTokenizer(s);
		Tokenize toknize=new Tokenize();
		toknize.token(st);
		
		
				

	}

}
