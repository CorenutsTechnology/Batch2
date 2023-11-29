package Exception2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class reThrowException  implements NestedTry{

	@Override
	public void nestedTry() {
		// TODO Auto-generated method stub
		
	}
	public void method() {
		try {
			nested1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
	}
	
	public void nested1() throws Exception {
		
	try {
		String name = null;
			
			System.out.println(name.length());
		}
		catch (NullPointerException e) {
			System.out.println(e);


}
	try {	
		FileInputStream fileInputStream=new FileInputStream("demo.text");
	}
	catch(FileNotFoundException e) {
		//System.out.println(e.getMessage());
		throw new FileNotFoundException("not found file Exaception"+"demo.text");
		
	}
		System.out.println("called function");
		
	
	}
}
