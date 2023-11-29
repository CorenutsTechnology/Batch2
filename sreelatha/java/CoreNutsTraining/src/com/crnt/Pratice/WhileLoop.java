package com.crnt.Pratice;

public class WhileLoop {
	public static void main(String[] args) {
		WhileLoop whileLoop = new WhileLoop();
		whileLoop.test();
		
	}
	public boolean test()
	{
		boolean flag =true;
		int i=0;
		System.out.println(i);
		while(flag)
		{
			System.out.println("while loop suceesss 1");
			if (i<=10) {
				
			
			System.out.println("while loop suceesss 2");
			break;
			}
						i++;
						
			
		}
		System.out.println("while loop suceesss 3");

		return flag =(i++<=10);
		
	}

}
