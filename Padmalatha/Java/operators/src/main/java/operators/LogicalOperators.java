package operators;

public class LogicalOperators {
	
	public boolean logicalAnd(int value1,int value2)
	{
		return (value1<=value2)&&(value1==value2);
	}

	public boolean logicalOr(int value1,int value2)
	{
		return (value1<value2)||(value1!=value2);
	}
	
	public boolean logicalNot(int value1,int value2)
	{
		return !(value1<value2);
	}
}
