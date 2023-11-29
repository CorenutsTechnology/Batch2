package operators;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class LogicalTest {

	LogicalOperators logicalOperators=new LogicalOperators();
	
	@Before
	public void print()
	{
		System.out.println("-------Before--------");
	}
	
	@Test
	public void andTest()
	{
		boolean result=logicalOperators.logicalAnd(10,20);
		System.out.println("LogicalAnd Result:"+result);
		assertFalse(result);
	}
	
	@Test
	public void orTest()
	{
		boolean result=logicalOperators.logicalOr(10,20);
		System.out.println("LogicalAnd Result:"+result);
		assertTrue(result);
		
	}
	
	@Test
	public void notTest()
	{
		boolean result=logicalOperators.logicalNot(10, 20);
		System.out.println("LogicalNot Result:"+result);
		assertFalse(result);
	}
}
