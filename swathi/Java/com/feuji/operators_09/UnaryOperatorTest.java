package com.feuji.operators_09;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class UnaryOperatorTest {
	
  UnaryOperator unaryOperator = new UnaryOperator();
  
  @Test
  public void postIncrementTest() {
	  
	  int result = unaryOperator.postIncrement(10);
	  assertEquals(12,result);
	  
  }
  @Test
  public void preIncrementTest() {
	  
	  int result = unaryOperator.preIncrement(10);
	  assertEquals(12,result);
	  
  }
  @Test
  public void postDecrementTest() {
	  
	  int result = unaryOperator.postDecrement(11);
	  assertEquals(10,result);
	  
  }
  @Test
  public void preDecrementTest() {
	  
	  int result = unaryOperator.preDecrement(13);
	  assertEquals(12,result);
	  
  }
  


}
