package exceptionHandling_17_9;

import java.io.FileInputStream;
import java.io.IOException;

class A 
{
	public void test() 
	{
		System.out.println("hellooo");
		
	}
}
class B extends A 
{
	public void test1() throws IOException
	{
		
			FileInputStream file = new FileInputStream("home.txt");
			//throw new RuntimeException();
		System.out.println("hi");
			
		
		
	}
	
}
public class MainCls {
	public static void main(String[] args) throws Exception {
		B b = new B();
		b.test1();
		
	}

}
