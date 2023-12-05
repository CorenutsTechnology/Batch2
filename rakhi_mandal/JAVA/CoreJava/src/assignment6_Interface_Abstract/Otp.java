package assignment6_Interface_Abstract;

import java.util.Random;

public class Otp {

	public static void main(String[] args) {
		Random random=new Random();
		int value=random.nextInt(5000);
		
		if(value<1000)
		{
			System.out.println("0"+value);
			}
			
		else if(value<100)
			{
			System.out.println("00"+value);
			}
		else
			System.out.println(
					
					value);
	

	}

}
