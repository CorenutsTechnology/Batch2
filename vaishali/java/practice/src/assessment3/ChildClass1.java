package assessment3;

class BaseClass1 {
	public final void method1()
	{
	System.out.println("Base Class Method 1");
	}
}

public class ChildClass1 extends BaseClass1{
//	public void method1()
//	{
//	System.out.println("Child Class Method 1");
//	}
	public static void main(String[] arg)
	{
	BaseClass c = new ChildClass();
	c.method1();
	}

	
}
