//p8,p9
package com.crnts.exceptions;

public class P7Exception implements ExceptionP7 {

	public static void main(String[] args) {
		P7Exception p7Exception=new P7Exception();
//		p7Exception.nullPointException();
//		p7Exception.no_nullPointException();
	for(int i=0;i<4;i++)
	System.out.println(9);
	System.out.println(9);
	System.out.println(9);
	System.out.println(9);
	System.out.println("rakhi");
	
	}

	@Override
	public void nullPointException() {

		
		try{String name=null;
			System.out.println(name.length());
		
	}catch(NullPointerException e)
	{
		System.out.println("Exception handled");
//		e.printStackTrace();
	}
	}

	@Override
	public void no_nullPointException() {

		
		try{String name="rakhi";
			System.out.println(name.length());
		
	}catch(NullPointerException e)
	{
		System.out.println("Exception handled");
//		e.printStackTrace();
	}
	}

}
