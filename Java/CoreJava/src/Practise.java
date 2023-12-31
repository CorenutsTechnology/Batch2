import java.io.IOException;

public class Practise 
{
	public static void test() throws ArithmeticException
	{
		System.out.println("test start");
		throw new ArithmeticException();
	}
	
	public static void disp() throws IOException ,ArithmeticException
	{
		System.out.println("disp start");
		test();
		System.out.println("disp end");
	}
	
	public static void view()
	{
		System.out.println("view start");
		try {
			disp();
		} catch (ArithmeticException | IOException e) {
			e.printStackTrace();
		}
		System.out.println("view end");
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("main");
		view();
		System.out.println("main end");
	}
}
