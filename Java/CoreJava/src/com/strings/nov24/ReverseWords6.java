package com.strings.nov24;

public class ReverseWords6 
{
	public String reverseWords(String string) 
	{
		String result="" ,temp="";
		for(int index=0;index<string.length();index++)
		{
			char ch = string.charAt(index);
			if(ch!= ' ')
			{
				temp=temp+ch;
			}
			else
			{
				temp += " ";
				result=temp+result;
				temp="";
			}
		}
		result=temp+" "+result;
		return result;
	}
	
	public static void main(String[] args)
	{
		ReverseWords6 reverseWords6 = new ReverseWords6();
		System.out.println(reverseWords6.reverseWords("CoreNuts Technologies Pvt ltd"));
	}

	
}
