package december11.method_references;

public class Test {

	public  int add(int a, int b)
	{
		return (a+b);
	}
	 
	public static void main(String[] args) 
	{
		Test test = new Test();
		System.out.println(test.add(10,20));
	}

}
