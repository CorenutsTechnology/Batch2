package com.org.string24;

public class PrimitiveToString {

	public static void main(String[] args) {
		int val1 = 5;
	      char val2 = 'z';
	      float val3 = 9.56f;
	      double val4 = 8.34;
	      byte val5=123;
	      boolean val6=true;
	      short val7=134;
	      System.out.println("Integer: "+val1);
	      System.out.println("Character: "+val2);
	      System.out.println("Float: "+val3);
	      System.out.println("Double: "+val4);
	      String str1 = String.valueOf(val1);
	      String str2 = String.valueOf(val2);
	      String str3 = String.valueOf(val3);
	      String str4 = String.valueOf(val4);
	      System.out.println("Converted to string...");
	      System.out.println(str1);
	      System.out.println(str2);
	      System.out.println(str3);
	      System.out.println(str4);
	      
	      String s1=Integer.toString(val1);
	      String s2=Character.toString(val2);
	      String s3=Float.toString(val3);
	      String s4=Double.toString(val4);
	      String s5=Byte.toString(val5);
	      String s6=Boolean.toString(val6);
	      String s7=Short.toString(val7);
	      
	   }


	

}
