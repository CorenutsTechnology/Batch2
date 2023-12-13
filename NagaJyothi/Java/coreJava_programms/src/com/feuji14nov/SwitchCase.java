package com.feuji14nov;

public class SwitchCase 
{
	public void switchCase()
	{
		for(int index=0;index<5;index++)
		{
			switch(index)
			{
			case 0:
				System.out.println("Case 0");
				//break;
			case 1:
				System.out.println("Case 1");
				//break;
			case 2:
				System.out.println("Case 2");
				//break;
			case 3:
				System.out.println("Case 3");
				//break;
			case 4:
				System.out.println("Case 4");
				//break;
			case 5:
				System.out.println("Case 5");
				break;
			default:
				System.out.println("Enter valind case number");
			}
		   
		}
	}
	public static void main(String[] args) 
	{
		SwitchCase result=new SwitchCase();
		result.switchCase();
		
		
	}

}
