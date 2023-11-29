package exception20thnov;

import org.junit.jupiter.api.Test;

public class TestImplementationClass {
	
	ImplementaionForNov20thAbstractMethods methods=new ImplementaionForNov20thAbstractMethods();
	
	@Test
	public void throwExceptionTest()
	{
		 try {
//				methods.throwingCheckedException();

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

	}
	@Test
	public void raisingInvalidAgeExceptionTest()
	{
//		methods.raisingUserDefinedException(20);
	}
	
	@Test
	public void raisingExceptionInCatchBlockTest()
	{
		try {
//			methods.raisingUserDefinedExceptionInCatchBlock(88,0,16);

		} catch (InvalidAgeException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	public void raisingNestedTryStatementsTest()
	{
		methods.nestedTryStatements();
	}
	@Test
	public void reThrowingExceptionTest()
	{
		try {
//			methods.reThrowExceptionInCatchBlock();

		} catch (Exception e) {
			System.err.println("exception handled: "+e.getMessage());
		}
	}
	
	

}
