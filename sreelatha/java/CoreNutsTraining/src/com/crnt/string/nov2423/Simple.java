package com.crnt.string.nov2423;

import java.util.StringTokenizer;

/*class StringTokenizer
{

	public StringTokenizer(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public boolean hasMoreTokens() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public char[] nextToken() {
		// TODO Auto-generated method stub
		return null;
	}
	
}*/
public class Simple {
	
	 public static void main(String args[]){  
		 
		 String s="my name is khan";
		 String [] str1= new String[] {"my","name","is","khan"};
		 String [] str = s.split("");
		 //+System.out.println(str);
		 for (int i = 0; i < str1.length; i++) {
			System.out.println(str1[i]);
		}
	   StringTokenizer st = new StringTokenizer("my name is khan", "" );  
	     while (st.hasMoreTokens()) {  
	         System.out.println(st.nextToken());  
	     }  
	

}
}
