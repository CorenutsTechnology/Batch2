package Exception2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import Exception.FileInputStream1;

public class ThrowsAndThrown implements ThrowAndThrownInterface {

	@Override
	public void ThrownAndThrow() {
		// TODO Auto-generated method stub
		
	}
	public void fuction1() {
		System.out.println(" calling function1");
		function2();
		System.out.println("calling function2");
	}
	public void function2() {
		System.out.println("called function 2");
		try {
			try {
				calculate(10, 0);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException"+ e.getMessage());
		}
		
		
		 FileInputStream fileInputStream=null;
	}
	

	public void calculate( int value1 ,int value2) throws Exception,ArithmeticException {
		
		int result=value1/value2;
	try {	
	FileInputStream fileInputStream=new FileInputStream("demo.text");
	}
	catch(FileNotFoundException e) {
		throw new RuntimeException("not found file Exaception"+"demo.text");
	}
		System.out.println("called function");
		
	
}

}
