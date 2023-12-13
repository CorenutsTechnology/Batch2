package com.org.flowcontrol10;

public class BreakKeyword {
	public void breakKey()
	{
		for(int start=1;start<=100;start++)
		{
			if(start==47)
			{
				break;
			}
			System.out.println(start);
		}
}
	public static void main(String[] args) {
		BreakKeyword breakKeyword=new BreakKeyword();
		breakKeyword.breakKey();
	}
}