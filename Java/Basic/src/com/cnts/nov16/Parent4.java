package com.cnts.nov16;

public interface Parent4 {

	public void display();
	
	public static void main(String[] args) {
		System.out.println("Parent Interface");
	}
}

interface Child extends Parent4 {
	public static void main(String[] args) {
		System.out.println("Child interface");
		
	} 
}
/*we can EXTEND a interface with another interface
but we cannot override the abstract method of parent interface in child interface
but we cannot IMPLEMENT one interface with another interface*/