package exception22thnov;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SonClass extends ParentClass {
	
//     @Override
//     void method() throws IOException {
//	 
//	 System.out.println("sub class"); we will get compiletime error
//}
	
	@Override
	void method() throws RuntimeException
	{
		int value=10/0;
		System.out.println("sub class"); 
		
	}
	

//}   we will get compiletime exception

//	@Override
//	void method() throws ArithmeticException {
//		System.out.println("sub class");
//	}

//	@Override
//	void method()  {
//		
//		System.out.println("sub class");
//	}
	
	
	public static void main(String[] args){
		SonClass son=new SonClass();
		son.method();
			}
}
