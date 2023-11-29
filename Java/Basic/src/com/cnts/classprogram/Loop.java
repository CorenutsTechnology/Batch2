package com.cnts.classprogram;

public class Loop {
	public void whilLoop()
	{
		boolean flag= true;
		int i = 0;
		while(flag)
		{
			System.out.println("loop "+i);
			int j=0;
			do {
				if(i==6)
				{
					System.out.println("6th iteration");
					break;
				}
				i++;
			}
			while(j++<=10);
			flag = (i++ <=10);
		}
	}
	
	public static void main(String[] args) {
		Loop loop = new Loop();
		loop.whilLoop();
	}
}
