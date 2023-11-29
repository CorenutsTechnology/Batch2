package com.crnt.string.nov2423;

public class CompareAddrOfStringObj {
	
	String str1 = "HYDERABAD";
	String str2="k";
	String str3 =new String("hyderabad");
	String str4 = new String("hyd");
	
	String str5=str4;
	
	
	boolean result = (str1.toString()==str2.toString());
	boolean result1=(str3==str4);
	
	boolean result3 = str3.equals(str4);
	boolean result4 =str2.equals(str1);
	
	boolean result5=(str5==str4);
	String s=str2.toUpperCase();
	
	
	

}
