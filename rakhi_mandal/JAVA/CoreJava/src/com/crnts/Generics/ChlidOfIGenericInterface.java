package com.crnts.Generics;

public class ChlidOfIGenericInterface<Integer> implements GenericInterface<Integer> {

	public static void main(String[] args) {
		ChlidOfIGenericInterface chlidOfIGenericInterface =new ChlidOfIGenericInterface();
		
		System.out.println(chlidOfIGenericInterface.m1("jhg"));
	}

	@Override
	public Integer m1(Integer obj) {
		// TODO Auto-generated method stub
		return obj;
		
	}

	


}
