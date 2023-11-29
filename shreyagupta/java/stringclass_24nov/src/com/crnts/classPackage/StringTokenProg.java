package com.crnts.classPackage;

import java.util.StringTokenizer;

public class StringTokenProg {
	
	public static void main(String[] args) {
		System.out.println("Ques: 8");
		String text = "my name:is Shreya;Gupta";
        StringTokenizer tokenizer = new StringTokenizer(text," :;");

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
        
       
	}

}
