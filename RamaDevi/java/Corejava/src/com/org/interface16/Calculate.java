package com.org.interface16;
interface Interface1
{
	void calculate(int value1,int value2);
	
}
public class Calculate implements Interface1 {

	@Override
	public void calculate(int value1,int value2)
	{
		System.out.println("value1:"+value1+" value2:"+value2);
		int sum=value1+value2;
		System.out.println("the sum is:"+sum);
	}
	public static void main(String[] args) {
		Calculate calculateObj=new Calculate();
		calculateObj.calculate(9, 7);
	}

}
