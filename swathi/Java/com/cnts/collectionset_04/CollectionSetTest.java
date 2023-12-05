package com.cnts.collectionset_04;

import org.junit.jupiter.api.Test;

public class CollectionSetTest {
	
	@Test
	public void primitiveToSetToSet() {
		PrimitiveToSet primitiveToSet = new PrimitiveToSet();
		primitiveToSet.displayElements();		
	}
	@Test
	public void displayTest() {
		StudentSet studentSet = new StudentSet();
		studentSet.display();	
	}
}
