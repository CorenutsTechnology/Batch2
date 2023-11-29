package com.cnuts.learningexception;

public class HandlingNullPointerExp {

	public void stringValue(String yourName) {

		try {

			String name = null;
			name.equals(yourName);

		} catch (NullPointerException e) {
			System.out.println("Exception occured :" + e);
		}

	}

}
