package com.org.string24;

public class SBDelete {

	public static void main(String[] args) {
		StringBuffer stringBuffer =new StringBuffer( "Corenuts Technologies Pvt Ltd");
		stringBuffer.delete(9, 21);
		System.out.println(stringBuffer);
	}

}
