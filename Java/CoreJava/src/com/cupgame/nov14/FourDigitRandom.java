/*
 * generate only four digit random numbers(otp generate program)
 */
package com.cupgame.nov14;

import java.util.Random;

public class FourDigitRandom {

	public void generate()
	{
		Random randomObject = new Random();
		
			/*
			 * nextInt(origin , bound)
			 * nextFloat(start ,end)
			 * it will generate random numbers between start and end-1
			 */
			int random=randomObject.nextInt(0,10000);
			//it will generate random numbers between 0 and 9999			

			if(random <10)
			{
				System.out.println("000"+random);
			}
			else if(random>9 && random<100){
				System.out.println("00"+random);
			}
			else if(random>99 && random<1000) {
				System.out.println("0"+random);
			}
			else {
				System.out.println(random);
			}
			
			//other logic
			
			String str="";
			for(int index=0;index<4;index++)
			{
				str=str+ randomObject.nextInt(10);
			}
			System.out.println(str);
	}
	public static void main(String[] args)
	{
		FourDigitRandom fourDigitRandom = new FourDigitRandom();
		fourDigitRandom.generate();
	}

}
