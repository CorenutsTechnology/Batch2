package operators;

public class OperatorsPractice {

	public int bitwiseAnd(int number1,int number2)
	{
		System.out.println(number1&number2);
		return (number1&number2);
	}
	
	public boolean LogicalAnd(int number1,int number2)
	{
		 boolean result=(number1<number2)&&(number1!=number2);
		    System.out.println(result);
		    return result;
	}
	public static void main(String[] args)
	{
	    int number1=10;
	    int number2=20;
	    
	    OperatorsPractice operatorsPractice=new OperatorsPractice();
	    operatorsPractice.bitwiseAnd(number1, number2);
	    
	    operatorsPractice.LogicalAnd(number1, number2);
	    
	    
	    String result1=(number1<number2)? "less" :"greater";
	    System.out.println(result1);
	}
}
