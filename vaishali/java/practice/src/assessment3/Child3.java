package assessment3;

import java.io.IOException;

class Parent1 {
public void m1() throws Exception {
	System.out.println("parent class");
}
}


public class Child3 extends Parent1{

	public void m1() throws IOException {
		System.out.println("child class");
		}
		public static void main(String[] args) throws Exception {
		Parent1 c = new Child3();
		try {
		c.m1();
		} catch (IOException e) {
		e.printStackTrace();
		}
		}

}
