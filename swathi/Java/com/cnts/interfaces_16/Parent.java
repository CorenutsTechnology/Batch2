package com.cnts.interfaces_16;

public interface Parent {
	
	private void privateMethod() {
		
	};
	default void defaultMethod() {
		
	}
	
	//protected void protectedMethod(){
		//Illegal modifier for the interface method protectedMethod; only public, private, abstract, default, static and strictfp are permitted
	}

	


