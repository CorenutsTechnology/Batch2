package Exception2;

import org.junit.Test;

public class TestClass {
	ThrowsAndThrown throwsAndThrown=new ThrowsAndThrown();
	CustomeException customeException=new CustomeException();
	CustemeException1 custemeException1=new CustemeException1();
	NestedYTryclass nestedYTryclass=new NestedYTryclass();
	reThrowException reThrowException=new reThrowException();
	CallerMethods callerMethods=new CallerMethods();
	CallerClass callerClass=new CallerClass();
	@Test
	public void  test1() throws CustomerException {
		
//		try {
//			throwsAndThrown.fuction1();
//			
//		}
//		catch(ArithmeticException e) {
//		//e.printStackTrace();
//		System.out.println("ArithmeticException"+e.getMessage());
//		
//	}
		
		//throwsAndThrown.fuction1();
		//customeException.psswordmatching("Tes");
		//custemeException1.SimpleIntrest(10, 12, 6);
		//nestedYTryclass.nested1();
		//reThrowException.method();
		//callerMethods.method();
		try {
			callerClass.method();
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
}
	}
