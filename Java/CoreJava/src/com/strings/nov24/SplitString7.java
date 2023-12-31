//7. Write a program to split a string and display tokenized strings

package com.strings.nov24;

public class SplitString7 
{
	public void tokenizer(String string)
	{
		String result="" ,temp="";
		String[] strArray = new String[4];
		int i=0;
		for(int index=0;index<string.length();index++)
		{
			char ch = string.charAt(index);
			if(ch!= ' ')
			{
				temp=temp+ch;
			}
			else
			{			
				strArray[i++]=temp;
				temp="";
			}
		}
		strArray[i]=temp;
		for(int i1=0;i1<4;i1++)
		{
			System.out.println(strArray[i1]);
		}
	}
	public static void main(String[] args) 
	{
		SplitString7 splitString = new SplitString7();
		String str="CoreNuts Technologies Pvt ltd";
		splitString.tokenizer(str);
	}

}
