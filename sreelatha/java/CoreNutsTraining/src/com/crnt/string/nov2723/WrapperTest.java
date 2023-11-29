package com.crnt.string.nov2723;

public class WrapperTest {
	public static void main(String[] args)  {
		//program 1
		/*
		 * UtilityFunctions utilityFun= new UtilityFunctions();
		 * utilityFun.wrapperTest();
		 */
		//program2 
		/*
		 * WrapValues wrapValues = new WrapValues(); wrapValues.wrapTest();
		 */
		//program3
		/*
		 * StringToPrimitiveValues st = new StringToPrimitiveValues(); st.primiTest();
		 */
		
		//program 4
		
		StringNumForExp stringNum = new StringNumForExp();
		try {
			stringNum.numTest();
		} catch (NumberFormatException e) {
			System.out.println("number format exception is handled");
			//e.printStackTrace();
		}
		
	}

}
