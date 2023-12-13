package com.feuji16nov;

import java.util.Random;
import java.util.Scanner;

public class OtpProgram 
{
	public int  genarataOtp( int value)
	{
		if(value<10)
		{
			System.out.println("000"+value);
		}
		else if(value<100)
		{
			System.out.println("00"+value);
		}
		else if(value<1000)
		{
			System.out.println("0"+value);
		}
		else
		{
			System.out.println(value);
		}
		return value;
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		Random random=new Random();
		OtpProgram output=new OtpProgram();
		int value=random.nextInt(10000);
		int result=output.genarataOtp(value);
		//String result1=result+"";
		System.out.println("Enter otp");
		int otp=scan.nextInt();
		//String otp1=otp+"";
		if(value==otp)
		{
			System.out.println("Sucess!!!");
		}
		else
		{
			System.out.println("try again!!");
		}
		
		
	}
}
