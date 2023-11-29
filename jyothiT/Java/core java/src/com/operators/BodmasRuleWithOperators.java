package com.operators;

public class BodmasRuleWithOperators {
	
	public void bodmaswithalloperators(int value1,int value2)
	{
		int result=(value1+value2)+10/2*2-10;
		System.out.println(result);
	}
	public void tryTask()
	{
		int value1=10;
		int value2=20;
		int value3=30;
		if((value1>20) && (value2++>10))
		{
			System.out.println(value2++);
		}
		else {
			System.out.println(value2);
		}
		if((value1>20)&(value3++>10))
		{
			System.out.println(value3);
		}
		else
		{
			System.out.println(value3);
		}
			}

	public static void main(String[] args) {
		BodmasRuleWithOperators bodmasRuleWithOperators=new BodmasRuleWithOperators();
		bodmasRuleWithOperators.bodmaswithalloperators(10, 10);
		bodmasRuleWithOperators.tryTask();
		

	}

}
