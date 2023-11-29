package com.crnt.exception.nov1723;

public class HandleExceptionInFinalImpl implements HandleExceptionInFinally {

	



	@Override
	public String stringOb() {
		String s = "asdf";
		try {
			for (int i = 0; i < s.length(); i++) {
				System.out.println(s.charAt(4));
				
			}
			
		} finally {
			System.out.println("finally block will be executed");
			
			
		}
		
		return s;
		
		
	}

}
