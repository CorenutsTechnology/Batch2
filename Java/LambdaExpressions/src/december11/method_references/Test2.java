package december11.method_references;

public class Test2
{
	public Test2()
	{
		
	}
	public Test2(int a , int b)
	{
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
//		Math math = Test::add; // syntax to copy static methods
		Test test = new Test();
		Math math = test::add;
		int result = math.sum(10,20);
		System.out.println(result);
		
	}
}
