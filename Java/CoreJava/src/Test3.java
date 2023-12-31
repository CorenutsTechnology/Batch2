import java.io.IOException;

public class Test3 extends Test2 {
	void method() throws IOException {
		 
	    // IOException is of type Checked Exception
	    // so the compiler will give Error
	 
	    System.out.println("SubClass");
	  }
	 
	  // Driver code
	  public static void main(String args[]) throws IOException {
	    Test2 s = new Test3();
	    s.method();
	  }
}
