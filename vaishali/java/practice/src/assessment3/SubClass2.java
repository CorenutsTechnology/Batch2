package assessment3;

import java.io.IOException;

class SuperClass2 {
	void method() throws Throwable {
		System.out.println("SuperClass");
}
}

public class SubClass2 extends SuperClass2{
//
	void method() throws IOException {
		System.out.println("SubClass");
		}
		public static void main(String args[]) throws Throwable {
		SuperClass2 s = new SubClass2();
		try {
		s.method();
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
}
