package com.cnts.classprogram;

import java.util.Random;

public class OTP 
{
	public static void main(String[] args) {
		Random random = new Random();
		int otp=0;
		while(otp<1)  {
			int num1 = random.nextInt(10);
			int num2 = random.nextInt(10);
			int num3 = random.nextInt(10);
			int num4 = random.nextInt(10);
			System.out.println(num1+""+num2+""+num3+""+num4);
			otp++;
		}
		
	}
}
