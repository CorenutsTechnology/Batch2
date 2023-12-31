package com.strings.nov24;

public class Count11 
{
	public void count(String str)
	{
		int[] array = new int[26];
		for(int index=0;index<str.length();index++)
		{
			char ch =str.charAt(index);
			array[ch-97]++;
		}
		System.out.println("repeated characters are: ");
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>1)
			{
				char ch= (char) (i+97);
				System.out.println(ch+" --> "+array[i]);
			}
		}
	}
	public static void main(String[] args) {
		Count11 count11 = new Count11();
		String str="pravali";
		count11.count(str);
	}
}
