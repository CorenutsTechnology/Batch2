package com.crnt.exception.nov2023;

public class AgeExceptionImpl implements AgeExceptionInterface {

	@Override
	public void print(int a) throws AgeExcetion {
		
 
	if(a<19)
	{
		 throw new  AgeExcetion("you are not eligible for voting");
	}
		
	}

}
