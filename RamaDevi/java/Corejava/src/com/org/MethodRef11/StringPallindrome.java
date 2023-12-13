package com.org.MethodRef11;

import java.util.function.Predicate;

public class StringPallindrome {

//	public boolean check(String s)
//	{
//		char[] charAr=s.toCharArray();
//		for(int i=0;i<charAr.length;i++)
//		{
//		if(charAr[i]==charAr[charAr.length])
//		{
//			return true;
//		}
//		}
//		return false;
//	}
	public static void main(String[] args) {
		String s="malayalam";
	Predicate <String> pre=(s1)->
	{
		char[] charAr=s.toCharArray();
		int i=0,j=charAr.length-1;
		while(i<=j)
		{
		if(charAr[i]!=charAr[j])
			return false;
		else
		{
		i++;
		j--;
		}
		
		}
		return true;
	};
	System.out.println(pre.test(s));
	}

}
