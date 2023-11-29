package programming;

import java.util.*;
public class OTP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random=new Random();
		int n=random.nextInt(10000);
		if(n>=1000)
		{
			System.out.println(n);
		}
		else if(n>=100)
		{
			System.out.println("0"+n);
		}
		else if(n>=10)
		{
			System.out.println("00"+n);
		}
		else
		{
			System.out.println("000"+n);
		}
	}

}
