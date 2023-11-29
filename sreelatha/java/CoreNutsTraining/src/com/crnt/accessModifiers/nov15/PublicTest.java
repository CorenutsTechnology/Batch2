package com.crnt.accessModifiers.nov15;

import org.junit.Test;

import com.crnt.nov07231.Employee;

public class PublicTest {
	Employee employee = new Employee();
	
	@Test
	public void test()
	{
		int result = employee.getAge();
	}
     PrivateClass privateClass = new PrivateClass();
     @Test
     public void privateTest()
     {
    	 
    			 
     }
     
     ProtectedMethods pm = new ProtectedMethods();
     @Test
     public void protectedTest()
     {
    	 int result = pm.test();
    	System.out.println( pm.name);
     }
     
     DefaultClass defaultClass = new DefaultClass();
     
     @Test
     public void defaultTest()
     {
    	 
    	 System.out.print(defaultClass.test());
     }
     
     

}
