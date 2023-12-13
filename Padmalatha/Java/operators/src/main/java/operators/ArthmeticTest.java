package operators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArthmeticTest {

	ArthmeticOperators arthmeticOperators=new ArthmeticOperators();
	
	@BeforeEach
	public void print()
	{
		System.out.println("----------Before------------");
	}
	@Test
	public void additionTest()
	{
		int result=arthmeticOperators.addition(10, 20);
		System.out.println("Addition result:"+result);
		assertEquals(30,result);
		
	}
	
	@Test
	public void subtractionTest()
	{
		int result=arthmeticOperators.subtraction(100, 50);
		System.out.println("Subtraction result:"+result);
		assertEquals(50,result);
	}
	
	@Test
	public void multiplicationTest()
	{
		int result=arthmeticOperators.multiplication(10, 20);
		System.out.println("Multiplication result:"+result);
		assertEquals(200,result);
	}
	
	@Test
	public void divisionTest()
	{
		int result=arthmeticOperators.division(100, 10);
		System.out.println("Division result:"+result);
		assertEquals(10,result);
	}
	
	@Test
	public void modularTest()
	{
		int result=arthmeticOperators.modular(10, 3);
		System.out.println("Modular result:"+result);
		assertEquals(1,result);
	}
	
	@Test
	public void increamentTest()
	{
	    int result=arthmeticOperators.incrementAndDecrement(10);
	    System.out.println(result);
	    assertEquals(11,result);
	}
	
}
