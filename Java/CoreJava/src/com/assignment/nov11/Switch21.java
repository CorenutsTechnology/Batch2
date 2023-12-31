package com.assignment.nov11;

public class Switch21 {

	public void trySwitch()
	{
		for(int index=1;index<5;index++)
		{
			switch(index)
			{
				case 1:
				{
					System.out.println("case 1");
//					break;
				}
				case 2:
				{
					System.out.println("case 2");
//					break;
				}
				case 3:
				{
					System.out.println("case 3");
//					break;
				}
				case 4:
				{
					System.out.println("case 4");
//					break;
				}
				default:
				{
					System.out.println("default");
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		Switch21 switchObject = new Switch21();
		switchObject.trySwitch();
	}

}
