package strings_24_11;

import java.util.StringTokenizer;

public class String1 {
    //extends String
	//extends StringBuffer
	//extends StringBuilder
	public static void main(String[] args) {
		
	
	    StringTokenizer st=new StringTokenizer("Hi, How Are You", ",");
	    System.out.println(st.countTokens());
	   
		/*
		 * while(st.hasMoreElements())//hasMoreTokens {
		 * System.out.println(st.nextElement());//nextToken }
		 * 
		 * StringTokenizer st1=new StringTokenizer("Hi  How Are You", " ");
		 * while(st1.hasMoreElements())//hasMoreTokens { st1.nextToken(",");
		 * 
		 * System.out.println(st1.nextElement());//nextToken }
		 * 
		 * StringTokenizer st2=new StringTokenizer("");
		 */
	}
	
}
