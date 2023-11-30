package assessment3;

import java.io.IOError;

class BaseClass {
	void method1() {
		System.out.println("Base Class Method 1");
	}
}


public class ChildClass extends BaseClass{

	protected void method1() throws IOError {
		System.out.println("Child Class Method 1");
	}
	public static void main(String[] arg) {
		ChildClass c = new ChildClass();
		c.method1();
	}

}
