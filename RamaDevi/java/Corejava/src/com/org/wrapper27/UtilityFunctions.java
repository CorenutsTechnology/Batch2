package com.org.wrapper27;

public class UtilityFunctions {

	public static void main(String[] args) {
		
		int intVal1 = 5;
	      char charVal2 = 'z';
	      float flaotVal3 = 9.56f;
	      double doubleVal4 = 8.34;
	      byte byteVal5=12;
	      boolean booleanVal6=true;
	      short shortVal7=134;
	      String sname="hdkiwh";
	      
	      System.out.println(sname.toString());
	      
	      Integer i=Integer.valueOf(intVal1);
	      System.out.println(i);
	      Character ch=Character.valueOf(charVal2);
	      System.out.println(ch);
	      Double dou=Double.valueOf(doubleVal4);
	      System.out.println(dou);
	      
	      
	      int i1=Integer.parseInt("10");
	      System.out.println(i1);
	      Boolean bol=Boolean.parseBoolean("true");
	      System.out.println(bol);
	      Byte byt=Byte.parseByte("12");
	      System.out.println(byt);
	      
	  
	}

}
