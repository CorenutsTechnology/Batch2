//Write a program to declare char array as your name and print your name in console without using loop

package com.arrays.nov8;

public class CharArrayWithoutLoops7 {

	int index=0;
	void print(char[] charArray)
	{
//		System.out.print(charArray[0]);
//		System.out.print(charArray[1]);
//		System.out.print(charArray[2]);
//		System.out.print(charArray[3]);
//		System.out.print(charArray[4]);
//		System.out.print(charArray[5]);
//		System.out.print(charArray[6]);
//		System.out.print(charArray[7]);
//		System.out.print(charArray[8]);
		
		if(index<charArray.length)
		{
			System.out.print(charArray[index++]);
			print(charArray);
		}
		
		
	}
	public static void main(String[] args) 
	{
		char[] charArray = {'p','r','a','v','a','l','i','k','a'};
		
		CharArrayWithoutLoops7 object = new CharArrayWithoutLoops7();
		object.print(charArray);
	}

}
