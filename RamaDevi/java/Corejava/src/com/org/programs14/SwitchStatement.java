package com.org.programs14;

public class SwitchStatement {
public void checkSwitch(int value)
{
	for(int start=1;start<=5;start++)
	{
	switch(value)
	{
	case 1:
		System.out.println("case-1");
		break;
	case 2:
		System.out.println("case-2");
		break;
	case 3:
		System.out.println("case-3");
		break;
	case 4:
		System.out.println("case-4");
		break;
	case 5:
		System.out.println("case-5");
		break;
		default:
			System.out.println("please enter valid number");
	}
	}
}
 public static void main(String[] args) {
	SwitchStatement switchstate=new SwitchStatement();
	switchstate.checkSwitch(3);
}
}
