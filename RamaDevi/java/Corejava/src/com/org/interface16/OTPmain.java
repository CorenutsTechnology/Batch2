package com.org.interface16;

import java.util.Random;
import java.util.Scanner;

public class OTPmain {

	public static void main(String[] args) {
		
	
		Random random=new Random();
		String string="";
		for(int index=0;index<4;index++)
		{
			int number=random.nextInt(10);
			string+=number;
		}
		System.out.println(string);

	}

}
