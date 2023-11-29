package operators;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RelationalTest {

	RelationalOperators relationalOperators=new RelationalOperators();
	
	@Test
	public void lessThanTest()
	{
		assertTrue(relationalOperators.lessThan(10, 20));
	}
	
	@Test
	public void greaterThanTest()
	{
		assertFalse(relationalOperators.greaterThan(10, 20));
	}
	
	@Test
	public void equalsTest()
	{
		assertFalse(relationalOperators.equal(10, 20));
	}
}
