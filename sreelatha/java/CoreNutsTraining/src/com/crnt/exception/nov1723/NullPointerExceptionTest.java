
package com.crnt.exception.nov1723;

import org.junit.Test;

public class NullPointerExceptionTest {
	
	NullPointerExceptionImpl n = new NullPointerExceptionImpl();
	@Test
	public void nameTest()
	{
		int result = n.name(null);
		
		System.out.println(result);
	}

}
