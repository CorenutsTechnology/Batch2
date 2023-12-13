package com.org.string24;

public class ReverseWords {
	public static String reverse(String s)
	{
		String string="";
	for(int index=s.length()-1;index>=0;index--)
	{
		string+=s.charAt(index);
	}
	return string;
	}
	
	public static void main(String[] args) {
		ReverseWords reverseWords=new ReverseWords();
		String name = "Corenuts Technologies Pvt Ltd";
		String revString="";
		String[] stringArray=name.split(" ");
//		for(int index=0;index<stringArray.length;index++)
//		{
//			revString+=reverse(stringArray[index]);
//			revString+=" ";
//		}
//		System.out.println(revString);

		for(int index=stringArray.length-1;index>=0;index--)
		{
			System.out.print(stringArray[index]+" ");
		}
	}

}
