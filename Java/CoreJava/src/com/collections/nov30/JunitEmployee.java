package com.collections.nov30;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class JunitEmployee 
{
	@Test
	public void EmployeeTestImpl()
	{
		String result= new SortusingComparable().sortMethod();
		assertEquals("success",result);
	}
	
	@Test
	public void EmployeeTestsortCmp()
	{
		String result= new SortUsingComparator().sortCmp();
		assertEquals("success",result);
	}
	
}



