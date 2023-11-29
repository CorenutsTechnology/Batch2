package operators;

public class ArthmeticOperators {

	public int addition(int value1,int value2)
	{
		int result=value1+value2;
		return result;
	}
	
	public int subtraction(int value1,int value2)
	{
		return value1-value2;
	}
	
	public int multiplication(int value1,int value2)
	{
		return value1*value2;
	}
	
	public int division(int value1,int value2)
	{
		return value1/value2;
	}
	
	public int modular(int value1,int value2)
	{
		return value1%value2;
	}
	
	public int incrementAndDecrement(int value)
	{
		value++;
		return value;
	}
}
