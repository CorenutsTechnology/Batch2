package com.org.programs14;

public class WhileLoop {
	public void whileLoop()
	{
		boolean flag=true;
		int i=0;
		while(flag)
		{
			System.out.println("loop"+i);
			int j=0;
			do
			{
				if(i==6)
				{
					System.out.println("6 th iteration");
					break;
				}
				i++;
			}
			while(j++<10);
			flag=(i++<=10);
		}
	}
	public static void main(String[] args) {
		WhileLoop whileloop=new WhileLoop();
		whileloop.whileLoop();
	}
}
