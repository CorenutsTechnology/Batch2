package com.crnt.constructors.nov2323;

public class ConstructorChainSub /* extends ConstructorChain */{
	public ConstructorChainSub()
	{
		//super(20);
		this(10);
		
		
		System.out.println("it is a sub class constructor");
	}

	public ConstructorChainSub(int i) {
		System.out.println(i);
	}

}
